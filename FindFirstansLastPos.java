import java.util.*;

class FindFirstandLastPos
{
	public static void main(String[] args) 
	{
		int arr[] = {5,5,7,7,8,8,10};
		int target = 5;
		int[] ans = Search(arr, target);
		
		System.out.println(Arrays.toString(ans));
	}
	
	public static int[] Search(int[] arr, int target){
		int i=0, j=arr.length-1;
		int ans[] = {-1,-1};
		
		while(i<=j){
			int mid = i + (j-1) / 2;
			
			if(arr[mid]==target){
				ans[0] = mid;
				j = mid - 1;
			}
			else if(target > arr[mid])
			{
				i = mid + 1;
			}
			else
				j = mid - 1;
		}
		
		i=0; 
		j=arr.length-1;
		while(i<=j)
		{
			int mid = i + (j-1) / 2;
			
			
			if(arr[mid] == target)
			{
				ans[1] = mid;
				i = mid + 1;
			}
			else if(target > arr[mid])
			{
				i = mid + 1;
			}
			else
				j = mid - 1;
		}
		
		return ans;
	}
}
