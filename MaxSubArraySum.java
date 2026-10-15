class MaxSubArraySum 
{
	public static void main(String[] args) 
	{
		int nums[] = {1,2,3,4,5,};
		int sum = 0;
		int n = nums.length;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++)
		{
			for(int j=i; j<n; j++)
			{
				sum = 0;
				for(int k=i; k<=j; k++)
				{
					sum += nums[k];	
				}
				
				maxSum = Math.max(sum, maxSum);
				
			}
		}
		System.out.println(maxSum);
	}
}
