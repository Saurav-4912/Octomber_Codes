public class TripletSumFinder {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 10;
        int n = arr.length;

        boolean found = false;

        for (int i = 0; i < n - 2; i++) {

            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                int sum = arr[i] + arr[j] + arr[k];

                if (sum == target) {
                    System.out.println(arr[i] + " , " + arr[j] + " , " + arr[k]);
                    found = true;
                    break;
                }

                if (sum < target)
                    j++;
                else
                    k--;
            }

            if (found)
                break;
        }

        if (!found)
            System.out.println("No triplet found");
    }
}
