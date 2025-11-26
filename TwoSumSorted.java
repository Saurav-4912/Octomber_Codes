public class TwoSumSorted {

	public static void main(String[] args) {


		int[] nums = {1,2,3,4,5,7,10,11,15};

		int target = 15;

		for(int i = 0; i < nums.length; i++){

			for(int j = i + 1; j < nums.length; j++){

				if((nums[i] + nums[j]) == target){
					System.out.println("(" + nums[i] + "," + nums[j] + ")");
				}
			}
		}
		
	}
}