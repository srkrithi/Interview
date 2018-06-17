package array;

public class LargestNSmallest {

	public static void main(String args[]) {
		int arr[] = {4,3,6,1,7,-9};
		int max = arr[0];
		int min = arr[0];
		for(int num : arr) {
			if(num > max) {
				max = num;
			}
			
			if(num < min) {
				min = num;
			}
		}
		
		System.out.println("max and min are "+max+ " " +min);
	}
}
