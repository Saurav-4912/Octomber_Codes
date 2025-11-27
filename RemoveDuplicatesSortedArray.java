public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {


		int[] nums = {1,1,2};


		int j = 0;

		for(int i = 1; i < nums.length; i++){

			if(nums[i] != nums[j]){
				j++;

				nums[j] = nums[i];
			}
		}


		for(int k = 0; k <= j; k++){

			System.out.println(nums[k]);
		}
	}
}