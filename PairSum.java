public class PairSum {

	public static void main(String[] args){

		int[] arr = {1,1,1,1,1};
		int n = 2;

		for(int i = 0; i < arr.length; i++){

			for(int j = i + 1; j < arr.length; j++){

				if((arr[i] + arr[j]) == n){

					System.out.println("("+ arr[i]+","+arr[j]+")");
				}
			}
		}
	}
}