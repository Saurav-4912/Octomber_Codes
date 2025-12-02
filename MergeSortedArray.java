public class MergeSortedArray {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        int m = 3, n = 3;

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];  // FIXED
                i--;
                k--;

            } else {
                nums1[k] = nums2[j];  // nums2 wins
                j--;
                k--;
            }
        }

        while (j >= 0) {      // copy remaining nums2
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        for (int num : nums1) {
            System.out.println(num);
        }

        System.out.println("END");
    }
}
