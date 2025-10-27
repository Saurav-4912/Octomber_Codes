public class FindDuplicateCharacters {

	public static void main(String[] args) {

		String str = "Programming";

		boolean[] isCount = new boolean[str.length()];

		for(int i = 0; i < str.length(); i++){

			if(isCount[i]){
				continue;
			}

			int count = 1;
			char ch = str.charAt(i);

			for(int j = 0; j < str.length(); j++){

				if((i != j) && ( ch == str.charAt(j))){

					count++;

					isCount[j] = true;
				}
			}

			if(count > 1){

				System.out.println(ch + " = " + count);
			}
		}
		
	}
}