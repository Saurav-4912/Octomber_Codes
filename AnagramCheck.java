public class AnagramCheck{
	public static void main(String[] args) {

		String str1 = "Hello";

		String str2 = "World";

		char[] ch = str2.toCharArray();

		boolean isAnagram = true;

		for(int i = 0; i < str1.length(); i++){

			boolean status = false;

			for(int j = 0; j < ch.length; j++){

				if(str1.charAt(i) == ch[j]){
					status = true;
					break;

				}
			}
			if(status){
				continue;
			}else{
				isAnagram = false;
				break;
			}

			
		}

		if(isAnagram){
			System.out.println("Anagram");
		}else{
			System.out.println("Not Anagram");
		}
		
	}
}