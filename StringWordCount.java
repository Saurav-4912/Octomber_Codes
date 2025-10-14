public class StringWordCount{

	public static void main(String[] args){

		String str = " This is spaced out ";

		str = str.trim();  // remove leading and trailing spaces

		int countWord = 0;

		for(int i = 0; i < str.length(); i++){

			if(str.charAt(i) == ' '){
				countWord++;
			}
		}

		if(str.length() == 0){
			System.out.println(countWord);
		}else{
			System.out.println(countWord+1);
		}
	}
}