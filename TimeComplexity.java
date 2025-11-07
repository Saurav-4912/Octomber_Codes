public class TimeComplexity {

	public static void main(String[] args) {

		// 1
		for (int i = 0; i < n; i++)
		{
    		for (int j = 0; j < m; j++)
    		{
        		System.out.println(i + j);
    		}
		}
		// TC : O(nm)

		// 2
		for (int i = 1; i < n; i = i * 2)
		{
    		System.out.println(i);
		}
		// TC : O(logn)

		// 3
		for (int i = 0; i < n; i++)
		{
    		for (int j = 0; j < n; j++)
    		{
        		for (int k = 0; k < n; k++)
        		{
            		System.out.println(i + j + k);
        		}
    		}
		}

		// TC : O(n3)

		// 4
		for (int i = 0; i < n; i++) {
    		System.out.println(i);
		}
		for (int j = 0; j < m; j++) {
   		    System.out.println(j);
		}
		// TC : O(n+m)

		//

		int i = n;
		while (i > 0) {
    		i = i / 2;
		}
		// TC : O(logn)

		for (int i = 0; i < n; i++) 
		{
   		for (int j = 0; j < i; j++) 
   		{
        		System.out.println(i + j);
    		}
		}
		// TC : O(n2)


		for (int i = 0; i < n; i++) {
    		System.out.println("Hello");
		}
		for (int i = 0; i < n * n; i++) {
    		System.out.println("World");
		}
		// TC : O(n2)

		for (int i = 0; i < n; i++) {
    		for (int j = 0; j < Math.sqrt(n); j++) {
        		System.out.println(i + j);
    		}
		}
		// TC : O(n2/2)

		for (int i = 0; i < n; i++) {
    		for (int j = i; j < n; j++) {
        		System.out.println(i + j);
    		}
		}
		// TC : O(n2)


		int sum = 0;
		for (int i = 0; i < n; i++) {
    		sum += arr[i];
		}
		System.out.println(sum);
		// TC : O(n)



	}
}