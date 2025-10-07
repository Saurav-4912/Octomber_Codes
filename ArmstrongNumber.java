public class ArmstrongNumber {

	public static void main(String[] args){

		// Armstrong Num ber = 1³ + 5³ + 3³ = 1 + 125 + 27 = 153
		int number = 123;
		int originalNumber = number;
		int result = 0;

		while(number > 0){
			int remainder = number % 10;
			result = (remainder * remainder * remainder) + result;
			number = number / 10;
		}

		if(originalNumber == result){
			System.out.println(result + " is a armstrong number");
		}else{
			System.out.println(result + " is not armstrong number");
		}

	}
}