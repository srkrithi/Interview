package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseStringSplChars {

	public static final Set<Character> invalid = new HashSet<>(Arrays.asList(',','$','#'));
	public static void main(String args[]) {
		String str = "a b cc";
		removeSpaces(str);
		char[] arr = str.toCharArray();
		//System.out.println("original string is "+str);
		//reverse(arr);
		String revStr = new String(arr);
		//.out.println("reversed string is "+revStr);
	}
	
	public static void removeSpaces(String str) {
		char arr[] = str.toCharArray();
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] == ' ') {
				str = str.substring(0, i) + str.substring(i+1, str.length());
				arr = str.toCharArray();
				System.out.println("string is "+str);
			}
		}
		System.out.println("str is "+str);
	}
	public static void reverse(char str[]) {
		
		int i = 0;
		int j = str.length - 1;
		
		while(i < j) {
			System.out.println("alphabet is "+str[i]);
			if(!Character.isAlphabetic(str[i])) {
				//or isInvalidChar(str[i])
				i++;
			}
			else if (!Character.isAlphabetic(str[j])) {
				j--;
			}
			else {
				System.out.println("swapped i and j");
				char tmp = str[i];
				str[i] = str[j];
				str[j] = tmp;
				i++;
				j--;
			}
		}
		
	}
	
	public static boolean isInvalidChar(char character) {
        return invalid.contains(character);
    }
	
	
}
