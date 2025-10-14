public class SumOfDigit {

	public static void main(String[] args){

		int number = 560;

		int originalNumber = number;

		int sum = 0;

		while(number > 0){

			int remainder = number % 10;

			sum += remainder;

			number = number / 10;
		}

		System.out.println("sum of digit of given number is : " + sum);
	}
}