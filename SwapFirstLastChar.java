public class SwapFirstLastChar{

	public static void main(String[] args) {
		
		String str = "saurav";

		char[] arr = str.toCharArray();

		int length = arr.length;

		char temp = arr[0];
		arr[0] = arr[length - 1];
		arr[length-1] = temp;

		String result = new String(arr);

		System.out.println(result);
	}
}