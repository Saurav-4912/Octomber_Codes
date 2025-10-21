public class CheckVowels{

	public static void main(String[] args) {
		

		String str = "HELLO world";

		// check vowel - a i e o u

		boolean status = false;

		for(int i = 0; i < str.length(); i++){

			char ch = str.charAt(i);

			if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){

				status = true;
				break;
			}
		}

		if(status){
			System.out.println("Yes, the string contains vowels");
		}else{
			System.out.println("No, the string does not contain vowels");
		}
	}
}