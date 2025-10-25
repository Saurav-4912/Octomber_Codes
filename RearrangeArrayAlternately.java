public class RearrangeArrayAlternately{

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9,10};

		// {1,10,2,9,3,8,4,7,5,6};

		int[] newArray = new int[arr.length];

		int i = 0;
		int j = arr.length - 1;
		int k = 0;

		while(i <= j) {
            if(k < arr.length) {
                newArray[k++] = arr[i++];   // take from start
            }
            if(i <= j && k < arr.length) {
                newArray[k++] = arr[j--];   // take from end
            }
        }
        
        // Print the result
        for(int num : newArray) {
            System.out.print(num + " ");
        }

	}
}