public class FibonacciSeries{

	public static void main(String[] args){

		// Fibonacci Series = 0 1 1 2 3 5 8 11 19 30

		int first = 0;
		int second = 1;

		for(int i = 1; i <= 10; i++){

			System.out.print(first + " ");

			int temp = first + second;
			first = second;
			second = temp;
			
		}
	}
}