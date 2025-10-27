public class ReverseEachWord {

	public static void main(String[] args) {

		String str = "I love java programming";

		String[] words = str.split(" ");

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < words.length; i++){

			String s = words[i];

			for(int j = s.length()-1; j >=0; j--){

				sb.append(s.charAt(j));

			}

			sb.append(" ");
		}

		System.out.println(sb.toString());
		
	}
}