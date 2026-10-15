import java.util.Scanner;

class Bank {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int Balance = 10000;
        System.out.println("Your Balance is: " + Balance);

        System.out.println("Enter the Deposit amount: ");
        int deposit = scan.nextInt();
        System.out.println("Amount Deposited Successfully");

        int totalAmount = Balance + deposit;
        System.out.println("Your current Balance is: " + totalAmount);
    }    
}
