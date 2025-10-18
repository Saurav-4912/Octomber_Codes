public class CountZeros {

	public static void main(String[] args){

		int number = 0;

		int originalNumber = number;

		int count = 0;


		if(number == 0){
			count = 1;
		

		while (number > 0){

			int remainder = number % 10;

			if(remainder == 0){
				count++;
			}

			number = number / 10;
		}
	}

		System.out.println(count);
	}
}