import java.util.Scanner;

public class ConcatenateStrings{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first string : ");
		String first = sc.nextLine();

		System.out.println("Enter the second string : ");
		String second = sc.nextLine();

		String result = first + second;

		System.out.println(result);
	}
}