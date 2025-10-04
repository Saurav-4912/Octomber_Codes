public class SecondLargest {

    public static void main(String[] args){

        // Input array
        int[] arr = {12, 5, 9, 21, 17, 5, 9};

        // Initialize largest and second largest with first two elements
        int largestNumber, secondLargest;
        if(arr[0] > arr[1]){
            largestNumber = arr[0];     // first element is largest
            secondLargest = arr[1];     // second element is second largest
        } else {
            largestNumber = arr[1];     // second element is largest
            secondLargest = arr[0];     // first element is second largest
        }

        // Traverse the array from index 2 to end
        for(int i = 2; i < arr.length; i++){

            // If current element is bigger than largest
            if(arr[i] > largestNumber){
                secondLargest = largestNumber; // old largest becomes second largest
                largestNumber = arr[i];        // update largest
            }
            // If current element is smaller than largest but bigger than second largest
            else if(arr[i] < largestNumber && arr[i] > secondLargest){
                secondLargest = arr[i];        // update second largest
            }
        }

        // Print the second largest number
        System.out.println(secondLargest + " is a second largest element");
    }
}
