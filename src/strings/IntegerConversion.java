package strings;

public class IntegerConversion {

	public static void main(String args[
	                                    ]) {
		String[] input = {"1","_","67","_"};
		StringBuilder sb = new StringBuilder();
		for(String str : input) {
			if(!(str.equals("_"))){
				sb.append(str);
			}
		}
		int num = Integer.parseInt(sb.toString());
		System.out.println("string is "+num);
	}
}
