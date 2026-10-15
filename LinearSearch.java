import java.util.*;

class LinearSearch 
{
	public static boolean lSearch(int nums[], int item)
	{
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i] == item)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		int nums[] = {5, 3,  10, 15, 20, 23, 40};
		int item = 11;
		
		boolean ans = lSearch(nums, item);
		
		System.out.println(ans);
	}
}
