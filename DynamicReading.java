import java.util.Scanner;

class DynamicReading {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the name: ");
        String name = scan.next();
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("Enter you gender: ");
        char gender = scan.next().charAt(0);

        System.out.println("your name is: " + name);
        System.out.println("your age is: " + age);
        System.out.println("your gender is: " + gender);
    }
}
