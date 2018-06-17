package strings;

public class StringPalindrome {

	private static boolean isPalindromeString(String str) {
        if (str == null)
            return false;
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }
	
	
//	int length  = inputString.length();
//    int i, begin, end, middle;
// 
//    begin  = 0;
//    end    = length - 1;
//    middle = (begin + end)/2;
// 
//    for (i = begin; i <= middle; i++) {
//      if (inputString.charAt(begin) == inputString.charAt(end)) {
//        begin++;
//        end--;
//      }
//      else {
//        break;
//      }
//    }
//    if (i == middle + 1) {
//      System.out.println("Palindrome");
//    }
//    else {
//      System.out.println("Not a palindrome");
//    } 	
    
    
	public static void main(String args[]) {
		boolean ret = isPalindromeString("madam");
		System.out.println("return is "+ret);
	}
}
