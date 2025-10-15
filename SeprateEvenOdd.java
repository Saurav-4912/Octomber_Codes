import java.util.*;

public class SeprateEvenOdd {

	public static void main(String[] args){

		int[] arr = {1, 2, 3, 4, 5, 6};

		ArrayList<Integer> even = new ArrayList();

		ArrayList<Integer> odd = new ArrayList();

		for(int i = 0; i < arr.length; i++){

			if(arr[i] % 2 == 0){
				even.add(arr[i]);
			}else{
				odd.add(arr[i]);
			}
		}

		System.out.println("Even Numbers : " + even);
		System.out.println("Odd Numbers : " + odd);
	}
}