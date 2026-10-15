class GCD
{
	public static int findGcd(int a, int b)
	{
		int gcd = 0;
		int n = Math.min(a, b);
		
		for(int i=1; i<=n; i++)
		{
			if(a % i == 0 && b % i == 0)
			{
				gcd = i;
			}
		}
		return gcd;
	}
	
	public static void main(String[] args)
	{
		int a = 12;
		int b = 18;
		
		int ans = findGcd(a, b);
		System.out.println("The Greatest Common Divisor is: " + ans);
	}
}