public class MergeTwoSortedArrays {

	public static void main(String[] args) {


		int[] arr1 = {1, 3, 5, 7, 9};

		int[] arr2 = {2, 4, 6, 8};

		int n = arr1.length;  // 5
		int m = arr2.length;  // 4

		int[] sortedArray = new int[n+m];

		int i=0;
		int j = 0;
		int k = 0;

		while(i < n && j < m){

			if(arr1[i] < arr2[j]){

				sortedArray[k] = arr1[i];
				k++;
				i++;
			}else if(j < i){
				sortedArray[k] = arr2[j];
				k++;
				j++;
			}

		}



		while( i < n){
			sortedArray[k] = arr1[i];
			i++;
			k++;
		}

		while( j < m){
			sortedArray[k] = arr2[j];
			j++;
			k++;
		}

		for(int num : sortedArray){
			System.out.print(num + " ");
		}
	}
}