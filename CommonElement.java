class CommonElement 
{
	public static void main(String[] args) 
	{
		int nums1[] = {1,5,10,20,40,80,100};
		int nums2[] = {6,7,20,80,100,200,300,400};
		
		
		int i=0, j=0; 
		while(i<nums1.length && j<nums2.length)
		{
			if(nums1[i] == nums2[j])
			{
				System.out.println(nums1[i]);
				i++;
				j++;
				
			}
			else if(nums1[i] < nums2[j])
			{
				i++;
			}
			else
			{
				j++;
			}
		}
	}
}
