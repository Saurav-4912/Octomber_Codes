
public class LargestSmallestElement {
	public static void main(String[] args)
	{

		int[] arr = {5,12,7,1,9};

		// find largest element from this array

		int maxNumber = arr[0];
		int minNumber = arr[0];

		for(int i = 1; i < arr.length; i++){
			if(arr[i] > maxNumber){
				maxNumber = arr[i];
			}else if(arr[i]<minNumber){
				minNumber = arr[i];
			}
		}

		System.out.println(maxNumber + " is largest number");
		System.out.println(minNumber + " is minimum number");
	}

}