public class DuplicateCharactersCount{

	public static void main(String[] args) {
		

		String str = "hello";

		// print all duplicate and their count

		boolean[] isDuplicate = new boolean[str.length()];


		for(int i = 0; i < str.length(); i++){

			if(isDuplicate[i]){
				continue;
			}

			char ch = str.charAt(i);

			int count = 1;

			for(int j = 0; j < str.length(); j++){

				if(i!=j && ch == str.charAt(j)){
					count++;

					isDuplicate[j] = true;
				}
			}

			if(count > 1){
				System.out.println(ch + " : " + count);
			}

		}
	}
}