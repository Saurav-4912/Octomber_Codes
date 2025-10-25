public class SecondHighestNumber {

	public static void main(String[] args) {

		int[] arr = {3,12,7,9,20};

		int max,secondMax;

		   if(arr[0] > arr[1]){
            max = arr[0];
            secondMax = arr[1];
        } else {
            max = arr[1];
            secondMax = arr[0];
        }

        for(int i = 2; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if(arr[i] < max && arr[i] > secondMax){
                secondMax = arr[i];
            }
        }

		System.out.println(secondMax);
	}
}