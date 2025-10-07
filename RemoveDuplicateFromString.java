public class RemoveDuplicateFromString{

	public static void main(String[] args){

		String str = "Programming";

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < str.length(); i++){

			char ch = str.charAt(i);

			boolean status = false;

			for(int j = 0; j < sb.length(); j++){
				if(sb.charAt(j) == ch){

					status = true;
					break;

				}
			}

			if(!status){
				sb.append(ch);
			}
		}

		

		System.out.println(sb.toString());
	}
}