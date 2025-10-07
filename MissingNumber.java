public class MissingNumber {

	public static void main(String[] args){

		int[] arr = {1, 3, 2, 6, 5};
		int N = 6;

		int totalSum = N * (N + 1) / 2;


		int sum = 0;

		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}

		int missingNumber = totalSum - sum;

		System.out.println(missingNumber);
	}
}