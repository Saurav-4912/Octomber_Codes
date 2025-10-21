public class CountLetterCase {

	public static void main(String[] args) {
		

		String str = "HelloWorld";

		int lowerCase = 0;
		int upperCase = 0;

		for(int i = 0; i < str.length(); i++){

			char ch = str.charAt(i);

			// if(Character.isUpperCase(ch)){
			// 	upperCase++;
			// }else if(Character.isLowerCase(ch)){
			// 	lowerCase++;
			// }

			if(ch >= 'a' && ch <= 'z'){
				lowerCase++;
			}else if(ch >= 'A' && ch <= 'Z'){
				upperCase++;
			}
		}

		System.out.println("Lower Case : " + lowerCase);
		System.out.println("Upper Case : " + upperCase);
	}
}