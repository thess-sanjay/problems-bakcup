import java.util.Scanner;
import java.util.Random;


class Atm 
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("1.Check Balance \n2.Deposit \n3.Withdraw \n4.Change Pin");
		System.out.print("Select any option: ");
		
		int option = scan.nextInt();
		double balance = 5000;
		int pinNo = 1234;
		long regPhNo = 1234567890L;
		
		switch(option)
		{
			case 1 : System.out.println("Welcome Mr. Mahi");
					 System.out.println("You have Rs. " + balance + "in you bank account");
					 break;
			
			case 2 : System.out.print("Enter the Amount you want to deposit: ");
					 double deposit = scan.nextDouble();
					 balance += deposit;
					 System.out.println("Amount Deposited Successfully...");
					 System.out.println("Your current Balance is: Rs." + balance);
					 break;
			
			case 3 : System.out.print("Enter the amount you want to Withdraw: Rs.");
					 double withdraw = scan.nextDouble();
					 System.out.print("Enter your Pin: ");
					 int LogPin = scan.nextInt();
					 if(LogPin == pinNo)
					 {
						 if(withdraw <= balance)
						 {
							 balance -= withdraw;
							 System.out.println("Your current Balance is: Rs." + balance);
						 }
						 else
						 { 
						 	 System.out.println("Insufficient Balance...");
						 }
					 }
					 else
					 {
						 System.out.println("Enter the Correct Pin...");
					 }
					 break;
					 
			case 4 : System.out.print("Enter your registered Phone Number: ");
					 long phNo = scan.nextLong();
					 if(phNo == regPhNo)
					 {
						 int otp = 1000 + random.nextInt(9000);
						 System.out.println("Your otp is: " + otp);
					 
						 System.out.print("Enter the otp: ");
						 int logOtp = scan.nextInt();
						 
							 if(logOtp == otp)
							 {
								System.out.print("Enter your Updated Pin: ");
								 int newpin = scan.nextInt();
								 pinNo = newpin;
								 System.out.println("Your Pin Number successfully Updated...");
								 System.out.println("Your new Pin " + pinNo);
							 }
							 else
							{
								 System.out.println("Enter the valid otp...");
							 }
					 }
					 else
					 {
						 System.out.println("Enter the valid Phone Number...");
					 }
					 break;
					 
			default: System.out.println("Enter the valid Option");
		}
	}
}
