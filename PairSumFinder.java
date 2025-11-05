public class PairSumFinder {

	public static void main(String[] args) {

		int[] arr = {1,2,3,9};

		int num = 7;

		boolean status = false;


		for(int i = 0; i < arr.length; i++){

			for(int j = i + 1; j < arr.length; j++){

				if((arr[i] + arr[j]) == num){

					System.out.println("("+ arr[i] + ","+ arr[j] + ")");

					status = true;
				}
			}
		}

		if(!status){
			System.out.println("No pair found");
		}

		
	}
}