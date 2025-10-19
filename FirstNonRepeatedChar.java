public class FirstNonRepeatedChar{

	public static void main(String[] args){

		String str = "progrpvammiong";

		for(int i = 0; i < str.length(); i++){

			char ch = str.charAt(i);

			boolean status = false;

			for(int j = 0; j < str.length(); j++){

				if(i != j && ch == str.charAt(j)){
					status = true;
					break;
				}
			}

			if(!status){
				System.out.println("First Non Repeated Char : " +ch);
				break;
			}
		}
	}
}