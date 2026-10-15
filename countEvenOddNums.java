class countEvenOddNums 
{
	public static int countNums(int nums[])
	{
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i] % 2 == 0)
				evenCount++;
			else
				oddCount++;
		}
			int ans = evenCount * oddCount;
			
			return ans;
	}
	
	public static void main(String[] args) 
	{
		int nums[] = {1,2,3,4,5,6};
		countNums(nums);
		System.out.println(ans);
	}
}
