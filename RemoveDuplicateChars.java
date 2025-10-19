public class RemoveDuplicateChars{

	public static void main(String[] args) {
		
		String str = "programming";

		StringBuilder sb = new StringBuilder();

		for(int i = 0;  i < str.length(); i++)
		{

			boolean status = false;
			for(int j = 0; j < sb.length(); j++){

				if(sb.charAt(j) == str.charAt(i)){
					status = true;
					break;
				}
			}

			if(!status){
				sb.append(str.charAt(i));
			}
		}

		System.out.println(sb.toString());
	}
}