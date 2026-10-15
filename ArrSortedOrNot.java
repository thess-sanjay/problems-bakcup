class ArrSortedOrNot
{
	public static boolean isSorted(int nums[])
	{
		for(int i=0; i<nums.length-1;i++)
		{
			if(nums[i] > nums[1+i])
				return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		int nums[] = {1,3,4,5};
		boolean ans = isSorted(nums);
		
		if(ans)
			System.out.println("Its sorted");
		else
			System.out.println("Not sorted");
	}
}