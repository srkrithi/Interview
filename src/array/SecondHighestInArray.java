package array;

public class SecondHighestInArray {

	//first sort the array and then return second element O(nlogn)
	
	//
	public static void main(String args[]) {
		int arr[] = {4,6,2,8,9, 10};
		int highest = Integer.MIN_VALUE;
		int secondHigh = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(num > highest) {
				secondHigh = highest;
				highest = num;
			}
			else if (num > secondHigh && num != highest) {
				secondHigh = num;
			}
		}
		
		System.out.println("second high is "+secondHigh);
	}
}
