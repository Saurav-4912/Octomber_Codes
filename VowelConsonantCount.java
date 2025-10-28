public class VowelConsonantCount {

	public static void main(String[] args) {

		String str = "sky";

		int vowel = 0;
		int consonant = 0;

		for(int i = 0; i < str.length(); i++){

			char ch = str.charAt(i);

			if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
				vowel++;
			}else{
				consonant++;
			}
		}

		System.out.println("Vowels : " + vowel);
		System.out.println("Consonant : " + consonant);
		
	}
}