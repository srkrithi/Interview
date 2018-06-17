package strings;

public class ReplaceSpacewith20 {

	public static void main(String args[]) {
		String str = "krithi sharan sr ";
		char chr[] = str.toCharArray();
		char ch[] = null;
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(chr[i] == ' ') {
				count++;
			}
		}
		System.out.println("count is "+count);
		int length = str.length() + count * 2;
		//ch[length-1] = '\0';
		for (int i = length - 1; i >= 0; i--)
	    {
	        if (ch[i] == ' ')
	        {
	            ch[length - 1] = '0';
	            ch[length - 2] = '2';
	            ch[length - 3] = '%';       
	            length = length - 3;
	             
	        }
	        else
	        {
	            ch[length - 1] = ch[i];       
	            length = length - 1;
	        }
	    }
		System.out.println("char is "+ch.toString());

		
	}
}
