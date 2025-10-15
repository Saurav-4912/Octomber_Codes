import java.util.ArrayList;

public class DuplicateCharacters{

	public static void main(String[] args){

		String str = "programming";

		ArrayList<Character> duplicateChar = new ArrayList<>();

		for(int i = 0; i < str.length(); i++){

			char ch = str.charAt(i);

			boolean flag = false;

			for(int j = i + 1; j < str.length(); j++){

				if(ch == str.charAt(j)){
					flag = true;
					break;
				}
			}

			if(flag){
				duplicateChar.add(ch);
				
			}
		}


		System.out.println("Duplicate character : " + duplicateChar);
	}
}