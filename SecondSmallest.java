public class SecondSmallest{

	public static void main(String[] args){

		int[] arr = {12, 5, 9, 21, 17, 5, 9};

		int smallest = arr[0];
		int secondSmallest = arr[1];

		for(int i = 2; i < arr.length; i++){

		 	if(arr[i] < smallest){
		 		secondSmallest = smallest;
		 		smallest = arr[i];
		 	}else if(arr[i] > smallest && arr[i] < secondSmallest){
		 		secondSmallest = arr[i];
		 	}
		}

		System.out.println(smallest + " is a smallest number");
		System.out.println(secondSmallest + " is a second smallest number");
	}
}