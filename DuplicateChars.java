public class DuplicateChars{

	public static void main(String[] args) {

		String str = "aabbcc";

		boolean[] isCount = new boolean[str.length()];

	for(int i = 0; i < str.length(); i++){

		if(isCount[i]){
			continue;
		}

		int count = 1;

		for(int j = i + 1; j < str.length(); j++){

			if(str.charAt(i) == str.charAt(j)){

				count++;

				isCount[j] = true;
			}
		}

		if(count > 1){
			System.out.print(str.charAt(i) + ",");
		}
	}
		
	}

	
}