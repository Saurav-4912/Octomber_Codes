public class RemoveSpacesString {

	public static void main(String[] args) {

		String str = "java is fun";

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < str.length(); i++){

			if(str.charAt(i) != ' '){

				sb.append(str.charAt(i));
			}
		}

		System.out.println(sb.toString());

		
	}
}