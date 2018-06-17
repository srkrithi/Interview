package strings;

public class CharacterOccurance {
	public static void main(String[] args) 
	{
		int c=0;
	String s = "Hello";
	System.out.println("enter the character you want to count");
	char k= 'e'; //It will read an integer, hence type casting it to char
	s=s.toLowerCase(); ///Remember, System.in.read() should be type casted                                  //and also it throws IOException
 
	char [] t =s.toCharArray(); 

	for(int i=0;i<t.length;i++) 
	{
		if (t[i]==k)//   if(t==k)
		{
			c++;
		}
	}
	System.out.print(c);
	
	}
}
