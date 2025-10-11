public class RotateArrayRight {

	public static void main(String[] args){

		int[] arr = {1,2,3,4,5};

		// output = {4,5,1,2,3};

		int rotateArray = 2;

		for(int i = 1; i <= rotateArray; i++){

			int temp = arr[arr.length - 1];

			for(int j = arr.length - 2; j >= 0; j--){

				arr[j+1] = arr[j];
			}

			arr[0] = temp;
		}

		for (int num : arr) {
            System.out.print(num + " ");
        }
	}
}