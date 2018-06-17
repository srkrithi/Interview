package array;

public class Findkthlargest {

	public static void main(String args[]) {
		int arr[] = {3,2,1,5,6,4};
		int k =2;
		
		int ret = getLargest(arr, k);
		System.out.println(+k+" th largest is "+ret);
	}
	
	//use priority queue solution
	//Java, Finding Kth largest value from the array
	
	//quick select method
	public static int getLargest(int arr[], int k) {
		if(k < 1 || arr == null) {
			return 0;
		}
		return getKth(arr.length - k + 1, arr, 0, arr.length-1);
	}
	
	public static int getKth(int k, int[] arr, int start, int end) {
		
		int pivot = arr[end];
		int left = start;
		int right = end;
		
		while(true) {
			while(arr[left] < pivot && left < right) {
				left++;
			}
			
			while(arr[right] >= pivot && right > left) {
				right--;
			}
			
			if(left == right)
				break;
			
			swap(arr, left, right);
		}
		
		swap(arr, left, end);
		
		if(k == left+1) {
			return pivot;
		}
		else if (k < left + 1) {
			return getKth(k, arr, 0, left-1);
		}
		else {
			return getKth(k, arr, left+1, end);
		}
		
	}
	
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
