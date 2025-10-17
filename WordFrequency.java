public class WordFrequency{

	public static void main(String[] args){

		String str = "One fish two fish red fish blue fish";

		String[] words = str.split(" ");

		int[] count = new int[words.length];

		for(int i = 0; i < words.length; i++){

			if(count[i] != 0){
				continue;
			}

			int Wordcount = 1;

			for(int j = i + 1; j < words.length; j++){

				if(words[i].equals(words[j])){
					Wordcount++;
					count[j] = -1;
				}
			}

			System.out.println(words[i] + " : " + Wordcount);
		}
	}
}