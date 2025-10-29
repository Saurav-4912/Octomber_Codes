public class LongestUniqueSubstring {

	public static void main(String[] args) {

		String str = "pwwkew";

		int length = str.length();

		int n = 0;

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < length; i++){

			char ch = str.charAt(i);

			boolean status = false;

			for(int j = 0; j < sb.length(); j++){

				if(ch == sb.charAt(j)){
					status = true;
				}
			}

			if(!status){

				sb.append(ch);
			}
		}

		System.out.println(sb.toString() + " : " + sb.length());
		
	}
}