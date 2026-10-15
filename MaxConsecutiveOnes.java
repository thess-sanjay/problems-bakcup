class MaxConsecutiveOnes 
{
	public static void main(String[] args) 
	{
		int nums[] = {0,1,1,0,0,1,1,1,1,0,1};
		int maxCount = Integer.MIN_VALUE;
		int count = 0;
		
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i] == 1)
			{
				count++;
				maxCount = Math.max(maxCount, count);
			}else{
				count = 0;
			}
		}
		
		System.out.println("Consecutives are : " + maxCount);
	}
}
