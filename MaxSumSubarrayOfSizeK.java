public class MaxSumSubarrayOfSizeK {

    public static void main(String[] args) {

        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int sum = 0;

        for (int i = 0; i <= nums.length - k; i++) {

            int temp = 0; // reset for each window

            for (int j = i; j < i + k; j++) {
                temp += nums[j];
            }

            if (temp > sum) {
                sum = temp;
            }
        }

        System.out.println(sum); // Output: 9
    }
}
