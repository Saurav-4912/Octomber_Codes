public class PalindromeCheck{

	public static void main(String[] args) {

		String str = "hello";

		StringBuilder sb = new StringBuilder();

		for(int i = str.length()-1; i>=0; i--){

			sb.append(str.charAt(i));
		}

		if(sb.toString().equals(str)){
			System.out.println("Given string are palindrome");
		}else{
			System.out.println("Given string are not palindrime");
		}
		
	}
}