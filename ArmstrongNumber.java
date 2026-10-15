import java.util.Scanner;

class ArmstrongNumber
{
	static Scanner scan = new Scanner(System.in);
	
	public static int armstrong(int n)
	{
		int original = n;
		int temp = n;
		int digit = 0;
		int sum = 0;
		while(n>0)
		{
			int ld = n % 10;
			digit++;
			n/=10;
		}
		
		while(temp > 0)
		{
			int ld2 = temp % 10;
			
			sum += (int)(Math.pow(ld2, digit));
			
			temp /= 10;
		}
		if(sum == original)
			System.out.println("Its a Armstrong Number");
		else
			System.out.println("Its not a Armstrong Number");
		
		return sum;
	}
	
	
	
	public static void main(String[] args)
	{
		System.out.print("Enter the Number: ");
		int n = scan.nextInt();
		
		armstrong(n);
	}
	
}