class AutomorphicNum 
{
	public static boolean isAutomorphic(int n)
	{
		int sq = n * n;
		
		while(n>0)
		{
			int ld = n % 10;
			int ld2 = sq % 10;
			
			if(ld != ld2)
				return false;
			n/=10;
			sq/=10;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		int n = 75;
		boolean ans = isAutomorphic(n);	
		if(ans)
			System.out.println("Its a Automorphic Number");
		else
			System.out.println("Its Not a Automorphic Number");
}
}
