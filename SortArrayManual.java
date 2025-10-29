public class SortArrayManual  {

	public static void main(String[] args) {

		int[] arr = {10,-1,4,3,1};

		for(int i = 0; i < arr.length; i++){

			for(int j = 0; j < arr.length; j++){

				if((i != j) && (arr[i] < arr[j])){

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for(int num : arr){

			System.out.println(num);
		}
		
	}
}