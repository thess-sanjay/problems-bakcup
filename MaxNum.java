class MaxNum 
{
	public static void main(String[] args) 
	{
		int a[] = {2,3,5,4,8,6,7, 9};
		
		int n = a.length;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println("Maximum Number is: " + max);
	}
}
