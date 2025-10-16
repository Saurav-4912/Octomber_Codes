import java.util.*;

public class ArrayUnionIntersection{

	public static void main(String[] args){

		int[] arr1 = {1,2,2,3};

		int n = arr1.length;

		int[] arr2 = {2,3,3,4};

		int m = arr2.length;

		// Intersection = Common Elements
		
		ArrayList<Integer> intersection = new ArrayList<>();

		for(int i = 0; i < n; i++){

			for(int j = 0; j < m; j++){

				if(arr1[i] == arr2[j]){

					if(!intersection.contains(arr1[i]))
					{
						intersection.add(arr1[i]);
						break;
					}
				}
			}
		}

		System.out.println("Intersection : " + intersection);


		// All element but not duplicate

		// arr1 = [1, 2, 2, 3]
		// arr2 = [2, 3, 3, 4]

	ArrayList<Integer> union = new ArrayList<>();

		// Add all elements of arr1
		for(int k = 0; k < n; k++)
		{
    		if(!union.contains(arr1[k]))
    		{
       		 union.add(arr1[k]);
    		}
		}

		// Add elements of arr2 not in union
		for(int k = 0; k < m; k++)
		{
   		 if(!union.contains(arr2[k]))
   		 	{
       		 union.add(arr2[k]);
    		}
		}


		System.out.println("Union : " +union);

	}
}