class Test {

	public static int factorial(int number){

		if(number == 1){
			return 1;
		}else{
			return number*(factorial(number-1));
		}
	}
}

public class FactorialUsingRecursion{

	public static void main(String[] agrs){

		int number = 5;
		int result = Test.factorial(number);

		System.out.println(result);
	}
}