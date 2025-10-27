public class WordCount{

	public static void main(String[] args) {

		String str = "I love india. My name is saurav";

		String[] words = str.split(" ");

		int count= 0;

		for(int i = 0; i < words.length; i++){

			count++;
		}

		System.out.println(count);
	}
}