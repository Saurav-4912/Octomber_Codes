public class SumAvgArray{

	public static void main(String[] args){

		int[] arr = {8,12,15,5};

		int length = arr.length;

		int sum = 0;

		float avg = 0;

		for(int i = 0; i < arr.length; i++){

			sum += arr[i];
		}

		avg = sum/length;


		System.out.println("Sum of given array is : " + sum);

		System.out.println("Average of given array is : " + avg);


	}
}