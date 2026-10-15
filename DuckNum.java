import java.util.Scanner;

class  DuckNum
{	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int count = 0;
		System.out.print("Enter the numbers: ");
		int n = scan.nextInt();
		
		while(n>0)
		{
			int ld = n % 10;
			
			if(ld == 0)
				count++;
			n/=10;
				
		}
			
		if(count > 0)
		{
			System.out.println("Its a Duck Number");
		}else{
			System.out.println("Its not a Duck Number");
		}
	}
	}
