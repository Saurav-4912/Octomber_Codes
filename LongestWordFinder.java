public class LongestWordFinder {

	public static void main(String[] args){

		String str = "I love programming in Java";

		String[] words = str.split(" ");

		int max = 0;

		String maxWord = "";

		for(int i = 0; i < words.length; i++){

			int length = words[i].length();

			if(length > max){
				max = length;
				maxWord = words[i];
			}
		}


		System.out.println(maxWord);
		


	}
}