
import java.util.Scanner;

class GreaterValues {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first num: ");
        int a = scan.nextInt();
        System.out.print("Enter the second num: ");
        int b = scan.nextInt();
        // int ans = a > b ? a : b;
        // System.out.println("The Greater number is: " + ans);

        String ans = a == b ? "Its a Equal value" : a > b ? "A is greater" : "B is Greater";
        System.out.println(ans);
        
    }
}