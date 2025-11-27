public class removeElement 
{

	public static void main(String[] args) 
	{
	
		int[] nums = {1,1,2};
        int j = 1;

        	for(int i = 1; i < nums.length; i++)
        	{

            	if(nums[i] != nums[j])
            	{
                	j++;
                	nums[j] = nums[i];
                	
            	}
        	}
    
    	System.out.println(j);
    
    }
}