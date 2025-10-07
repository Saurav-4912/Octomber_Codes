public class PerfectNumber{

	public static void main(String[] args){

		int number = 12;

		int sum = 1;

		for(int i = 2; i < number; i++){

			if(number % i == 0){
				sum += i;
			}
		}

		if(number == sum){
			System.out.println(number + " is a perfect number");
		}else{
			System.out.println(number + " is not perfect number");
		}
	}
}