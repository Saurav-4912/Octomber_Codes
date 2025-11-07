import java.util.ArrayList;

public class UniqueArrayIntersection{

	public static void main(String[] args) {


		int[] arr1 = {1, 1, 2, 2, 3, 4};
		int[] arr2 = {2, 2, 4, 4, 6, 8};

		int n = arr1.length;
		int m = arr2.length;

		ArrayList<Integer> AL = new ArrayList<>();
		boolean[] isCheck = new boolean[n];

		for(int i = 0; i < n; i++){

			for(int j = i + 1; j < n; j++){

				if(arr1[i] == arr1[j]){
					isCheck[j] = true;
				}
			}

			if(isCheck[i]){
				continue;
			}else{

				for(int k = 0; k < m; k++){

					if(arr1[i] == arr2[k]){
						AL.add(arr1[i]);
						break;
					}
				}
			}

		}

		System.out.println(AL);
		
	}
}