public class SecondLargest {

	public static void main(String[] args){


		int[] arr = {12,5,9,21,17,5,9};

		int largestNumber = arr[0];
		int secondLargest = arr[1];

		for(int i = 2; i < arr.length; i++){

			if(arr[i] > largestNumber){
				secondLargest = largestNumber;
				largestNumber = arr[i];
			}else if(arr[i] < largestNumber && arr[i] > secondLargest){
				secondLargest = arr[i];
			}
		}

		System.out.println(secondLargest);
	}
}