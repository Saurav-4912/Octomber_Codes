public class PrintLetterTwice {

	public static void main(String[] args) {

		String str = "java";

		int n = str.length();

		StringBuilder sb = new StringBuilder();

		int i =0;
		int j =0;

		while(i < n && j < n){

			char ch = str.charAt(i);
			char ch2 = str.charAt(j);

			sb.append(ch);
			sb.append(ch2);

			i++;
			j++;
		}

		System.out.println(sb.toString());


		// Second Approch

		StringBuilder newString = new StringBuilder();

		for(int k = 0; k < n; k++){

			newString.append(str.charAt(k)).append(str.charAt(k));
		}

		System.out.println(newString.toString());

		
	}
}