public class ReverseArray{

	public static void main(String[] args){

		int[] arr = {1,2,3,4,5};

		int start = 0;
		int end = arr.length-1;

		while(start < end){

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}

		for(int k = 0; k < arr.length; k++){
			System.out.print(arr[k] + " ");
		}
	}
}