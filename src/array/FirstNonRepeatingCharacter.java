package array;

import java.util.HashMap;
import java.util.Map;

class CountIndex{
	public int index;
	public int count;
	
	public CountIndex(int index) {
		this.count = 1;
		this.index = index;
	}
	
	public void incCount() {
		this.count++;
	}
}
public class FirstNonRepeatingCharacter {
	
	public static void main(String[] args)
	{
		String str = "geeksforgeeks";
		//optimised solution
		
		Map<Character,CountIndex> opMap = new HashMap<Character,CountIndex>();
		char[] arr = str.toCharArray();
		for(int i = 0; i < arr.length-1; i++) {
			char ch = arr[i];
			if(opMap.containsKey(ch)) {
				opMap.get(ch).incCount();
			}
			else {
				opMap.put(ch, new CountIndex(i));
			}
		}
		int result = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length-1; i++) {
			char ch = arr[i];
			if(opMap.get(ch).count == 1 && result > opMap.get(ch).index) {
				result = opMap.get(ch).index;
			}
		}
		
//		Map<Character, Integer> map = new HashMap<Character, Integer>();
//		for(char ch : arr) {
//			if(map.containsKey(ch)) {
//				map.put(ch, map.get(ch) + 1);
//			}
//			else {
//				map.put(ch,  1);
//			}
//		}
//		//traversing through the string twice O(n2) in worst case
//		for(char ch : arr) {
//			if(map.get(ch) == 1) {
//				System.out.println("first non repeating character is "+ch);
//				break;
//			}
//		}
		
		
		
	}
}
