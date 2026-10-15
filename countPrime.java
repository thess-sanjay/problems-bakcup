class countPrime
{
	public static boolean isPrime(int n){
		
		for(int i=2; i<n; i++){
			
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		
		int[] nums = {2,3,4,5,6,7,8,9,11,12,13,14,15};
		
		int count = 0;
		
		for(int i=0; i<nums.length; i++){
			
			if(isPrime(nums[i]))
				count++;
		}
		
		System.out.println(count);
	}
}