import java.util.Scanner;

class AddFirstLast 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Numbers: ");
		int n = scan.nextInt();
		
		int lastDigit = n % 10;
		System.out.println("Last Digit is: "+ lastDigit);
		
		while(n>9)
		{
			int lDigit = n % 10;
			n/=10;
		}
		
		System.out.println("First Digit is: "+ n);
		
		int sum = lastDigit + n;
		System.out.println("The sum is: " + sum);
		
	}
}
