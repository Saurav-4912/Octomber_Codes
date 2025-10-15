public class SumEvenOdd {

	public static void main(String[] args){

		int[] arr = {10, 15, 20, 25, 30};

		int sumEven = 0;
		int sumOdd = 0;

		for(int i = 0; i < arr.length; i++){

			if(arr[i] % 2 == 0){

				sumEven += arr[i];
			}else{
				sumOdd += arr[i];
			}
		}

		System.out.println("Sum of even numbers : " + sumEven);
		System.out.println("Sum of odd numbers : " + sumOdd);
	}
}