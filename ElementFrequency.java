public class ElementFrequency{

	public static void main(String[] args){

		int[] arr = {10,20,12,30,20,10};

		boolean[] isPresent = new boolean[arr.length];  // default false;

		for(int i = 0; i < arr.length; i++){

			if(isPresent[i]){   // already counted
				continue;
			}

			int count = 1;

			

			for(int j = i + 1; j < arr.length; j++){

				if(arr[i] == arr[j]){

					count++;

					isPresent[j] = true; // mark as counted
				}
			}

			System.out.println(arr[i] + " : " + count);
		}
	}
}