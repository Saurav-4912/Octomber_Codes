public class RemoveSpaces{

	public static void main(String[] args){

		String str = "Hello I am saurav pawar";

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < str.length(); i++){

			char ch = str.charAt(i);

			if(ch != ' '){
				sb.append(ch);
			}
		}

		System.out.println(sb.toString());
	}
}