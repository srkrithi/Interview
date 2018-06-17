package array;

import java.util.HashMap;
import java.util.Map;

public class findPairsLessThanNumber {
	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,5,6};
		int sum = 7;
	
		//if array is sorted
		//time - O(n) space - O(1)
//		int l = 0, r = a.length - 1, result = 0;
//		while(l < r) {
//			if(a[l] + a[r] < sum) {
//				result += (r - l);
//				System.out.println("pairs are "+a[l]+ ", " +a[r]);
//				l++;
//			}
//			else {
//				r--;
//			}
//		}
//		System.out.println("result is "+result);
		
		//if array is unsorted use hashmap
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int num : a) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			}
			else {
				map.put(num, 1);
			}
		}
		
		for(int num : a) {
			System.out.println("num is "+num);
			int look = sum - num;
			System.out.println("look is "+look);
			if(map.containsKey(look)) {
				System.out.println("pairs are "+num+ ", "+look);
			}
		}
		
	}
}
