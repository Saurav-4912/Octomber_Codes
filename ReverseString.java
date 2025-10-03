public class ReverseString {
	public static void main(String[] args){

		// First Option
		/*
		String str = "Java Code";

		String reverseString = "";

		for(int i = str.length()-1; i>=0; i--){
			reverseString += str.charAt(i);
		}

		System.out.println(reverseString);
		*/


		// Second Option: Using String Builder

		String name = "Saurav Pawar";

		StringBuilder sb = new StringBuilder();

		for(int i = name.length()-1; i>=0; i--){
			sb.append(name.charAt(i));
		}

		String reverseString = sb.toString();

		System.out.println(reverseString);


	}
}