package array;

public class ReverseArray {

	//reverse array in place
	//time complexity O(n/2) which is O(n)
	//test cases : {1,2,3,4,5} {1,2,3,4,5,6} 
	
	public static void main(String args[]) {
		int arr[] = {1,3,5,7,9, 11};
		
		System.out.println("before swapping ");
		print(arr);
		for(int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		System.out.println("after swapping ");
		print(arr);
	}
	
	public static void print(int[] arr) {
		for(int num : arr) {
			System.out.println("elements are"+num);
		}
	}
}
