public class MergeSortedArrays{

	public static void main(String[] args){

		int[] arr1 = {1,3,5,7,9};

		int n = arr1.length;

		int[] arr2 = {0,2,4,6,8};

		int m = arr2.length;

		int[] MergeArray = new int[n+m];

		int i = 0;

		int j = 0;

		int k = 0;

		while(i < n && j < m){

			if(arr1[i] < arr2[j])
			{

				MergeArray[k] = arr1[i];
				i++;
				k++;

			}else if(arr2[j] < arr1[i])
			{
				MergeArray[k] = arr2[j];
				j++;
				k++;
			}
		}

		while(i < n){
				MergeArray[k] = arr1[i];
				i++;
				k++;
		}

		while (j < m) {
   		 MergeArray[k] = arr2[j];
    		j++;
    		k++;
		}


		for(int x = 0; x < MergeArray.length; x++){

			System.out.print(MergeArray[x] + " ");
		}



	}
}