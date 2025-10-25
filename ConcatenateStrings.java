import java.util.Scanner;

public class ConcatenateStrings{

	public static void main(String[] args) {

		// Approch - 1
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first string : ");
		String first = sc.nextLine();

		System.out.println("Enter the second string : ");
		String second = sc.nextLine();

		String result = first + second;

		System.out.println(result);


		// Approch - 2

		String str1 = "Hello";

		String str2 = "World";

		StringBuilder sb = new StringBuilder();

		sb.append(str1);
		sb.append(str2);

		System.out.println(sb.toString());
	}
}