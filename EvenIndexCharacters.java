public class EvenIndexCharacters{


	public static void main(String[] args) {

		String str = "Hello";

		for(int i = 0; i < str.length(); i += 2){

			char ch = str.charAt(i);

			System.out.println(ch);
		}
		
	}
}