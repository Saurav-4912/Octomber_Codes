public class ReverseWords {

	public static void main(String[] args) {
		
		String str = "java Programming";

		String[] words = str.split(" ");

		StringBuilder sb = new StringBuilder();

		

		for(int i = 0; i < words.length; i++){

			String word = words[i];

			for(int j = word.length() - 1; j >= 0; j--){

				sb.append(word.charAt(j));
			}
			sb.append(" ");
		}

		System.out.println(sb.toString());
	}
}