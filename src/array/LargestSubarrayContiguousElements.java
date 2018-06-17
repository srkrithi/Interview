package array;

import java.util.HashSet;
import java.util.Set;

public class LargestSubarrayContiguousElements {

	public static void main(String args[]) {
		int arr[] = {10,12,11,9,5,8,1,0,3};
		Set<Integer> set = new HashSet<>();
		for(int num : arr) {
			set.add(num);
		}
		
		int max = 1;
		for(int num : arr) {
			int left = num - 1;
			int right = num + 1;
			int count = 1;
			
			while(set.contains(left)) {
				count++;
				set.remove(left);
				left--;
				System.out.println("");
			}
			
			while(set.contains(right)) {
				count++;
				set.remove(right);
				right++;
			}
			
			max = max > count ? max : count;
		}

		System.out.println("max contiguous elements are "+max);
	}
}
