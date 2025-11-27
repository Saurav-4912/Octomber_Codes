public class TwoSumSorted1 {

	public static void main(String[] args) {


		int[] nums = {-3,-2,0,2,4,5};
		int target = 1;

		int left = 0;
		int right = nums.length - 1;


		while(left < right){

			int sum = nums[left] + nums[right];

			if(sum == target){

				System.out.println(left + "," + right);
				break;

			}else if(sum > target){

				right--;

			}else{
				left++;
			}
		}
		
	}
}