public class TwoArrayEqual 
{

	public static void main(String[] args)
	{

		int[] arr1 = {1,2,3,4,5,6};

		int[] arr2 = {1,2,3,4,5,6};

		int length1 = arr1.length;

		int length2 = arr2.length;
	
		boolean status = true;

		if(length1 == length2)
		{
			for(int i = 0; i < length1; i++)
			{

				for(int j = i; j <= i; j++)
				{

					if(arr1[i] != arr2[j])
					{

						status = false;
						break;
					}
				}
			}
		}
		else
		{

			status = false;
		}

		if(status)
		{
			System.out.println("Arrays are eqauls");
		}else
		{
			System.out.println("Arrays are not equals");
		}
	}
}