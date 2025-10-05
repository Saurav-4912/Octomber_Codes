public class CountVowelsConsonant{
	public static void main(String[] args){

		String str = "Saurav Bhaskar Pawar";

		str = str.toLowerCase();

		int vowel = 0;
		int consonant = 0;

		for(int i = 0; i < str.length(); i++){

			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
				vowel++;
			}else{
				consonant++;
			}
		}

		System.out.println("Vowels : " + vowel);
		System.out.println("Consonant : " + consonant);
	}
}