class BinarySearch 
{
	public static int binarySearch(int nums[], int item)
	{
		int i=0;
		int j=nums.length-1;
		while(i<=j)
		{
			int mid = (i+j) / 2;
			
			if(nums[mid] == item)
				return mid;
			else if(item < nums[mid])
				j = mid -1;
			else
				i = mid + 1;
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		int nums[] = {2,3,4,5,6,12,14,15,22,28,29,34};
		int item = 15;
		
		int ans = binarySearch(nums, item);
		
		System.out.println(ans);
	}
}
