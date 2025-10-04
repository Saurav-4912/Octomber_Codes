public class PrimeNumber {
	public static void main(String[] args){

		// Prime Number : 2,3,5,9,11,13,17,19,23,29
		/*
		int number = 11;

		boolean status = true;

		for(int i = 2; i<number; i++){
			if(number % i == 0){
				status = false;
			}
		}

		if(status){
			System.out.println(number + " is prime number");
		}else{
			System.out.println(number + " is not prime number");
		}
		*/


		// Print All prime number between 1 to 100
		/*
		for(int i = 2; i<=100; i++){
			boolean flag = true;
			for(int j = 2; j<i; j++){
				if(i % j == 0){
					flag = false;
				}
			}
			if(flag){
				System.out.println(i);
			}
		}
		*/

		// Count how many prime number exits between 1 to 100
		int count = 0;
		for(int i = 2; i<=100; i++){
			boolean result = true;
			for(int j = 2; j<i; j++){
				if(i % j == 0){
					result = false;
				}
			}
			if(result){
				count++;
			}
		}

		System.out.println("Total prime number between 1 to 100 : " + count);

		// Find the sum of all prime numbers in a given range

		int sum = 0;
		for(int k = 2; k<=100; k++){
			boolean flag = true;
			for(int m = 2; m<k; m++){
				if(k % m == 0){
					flag = false;
				}
			}
			if(flag){
				sum += k;
			}
		}

		System.out.println("Total sum of prime number between 1 to 100 : " + sum);
		

	}
}