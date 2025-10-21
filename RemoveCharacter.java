public class RemoveCharacter {

	public static void main(String[] args) {

		String str = "saurav";

		char ch = 'a';

		StringBuilder newString = new StringBuilder();

		for(int i = 0; i < str.length(); i++){

			if(ch != str.charAt(i)){

				newString.append(str.charAt(i));
			}
		}
		System.out.println(newString.toString());
		
	}
}