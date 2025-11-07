public class DutchFlagSorter {

	public static void main(String[] args) {


		int[] arr = {2,0,2,1,1,0};

		int n = arr.length;

		for(int i = 0; i < n; i++){

			for(int j = i + 1; j < n; j++){

				if(arr[i]>arr[j]){

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for(int num : arr){
			System.out.print(num + " ");
		}
		
	}
}