public class ReplaceCharacter{

	public static void main(String[] args) {

		String str = "hello world";

		char oldChar = 'l';

		char newChar = 'x';

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < str.length(); i++)
		{

			char ch = str.charAt(i);

			if(ch == oldChar)
			{
				sb.append(newChar);
			}else
			{
				sb.append(ch);
			}

		}
		
		
		System.out.println(sb.toString());
	}
}