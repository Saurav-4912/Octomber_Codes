public class  CountCharacters {

	public static void main(String[] args) {

		String str = "@home#2025";

		int specialChar = 0;
		int consonant = 0;
		int vowel = 0;

		for(int i = 0; i < str.length(); i++){

			char ch = str.charAt(i);


			// Check for vowles
			if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' ||
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
				vowel++;
			}

			// Check for consonant
			else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
				consonant++;
			}


			// Check for special char
			else{
				specialChar++;
			}
		}

		System.out.println("vowel : " + vowel + ", consonant : " + consonant + ", specialChar : " + specialChar);
	}
}