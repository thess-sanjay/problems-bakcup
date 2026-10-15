
import java.util.Scanner;

class ConditionalOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Num: ");
        int num = scan.nextInt();

        String ans = num %2==0?"even":"odd";
        System.out.println( "The given number is: " + ans);
    }
}
