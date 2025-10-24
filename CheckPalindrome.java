public class CheckPalindrome {
	public static void main(String[] args)

	{
		String str = "madam";

		int length = str.length();

		StringBuilder sb = new StringBuilder();

		for(int i = length-1; i>=0; i--){

			sb.append(str.charAt(i));
		}

		

		if(sb.toString().equals(str)){
			System.out.println("Given string are palindrome");
		}else{
			System.out.println("Given string are not palindrome");
		}
	}
}