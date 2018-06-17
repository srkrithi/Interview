package strings;

public class Anagrams {

	public static void main(String args[]) {
		String word = "mary";
		String anagram = "army";
		String anagrams = "army";
		
		char[] arr = word.toCharArray();
		for(char ch : arr) {
			int index = anagram.indexOf(ch);
			System.out.println("char is "+ch+ " and index is "+index);
			if(index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index+1, anagram.length());
				//System.out.println("anagram is "+anagram);
			}
			else {
				System.out.println("not anagrams");
			}
			
		}
		if(anagram.length() == 0) {
			System.out.println("anagrams");
		}
		
		//using string builder
		StringBuilder sb = new StringBuilder(anagrams);
		for(char ch : arr) {
			int index = sb.indexOf(""+ch);
			System.out.println("char is "+ch+ " and index is "+index);
			if(index != -1) {
				sb.deleteCharAt(index);
			}
			else {
				System.out.println("not anagrams");
			}
		}

		
		if(sb.length() == 0) {
			System.out.println("anagrams");
		}
	}
}
