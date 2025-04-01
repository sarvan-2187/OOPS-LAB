import java.util.Scanner;

public class MethodOverloadingExample1 {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.print("Enter a third number (optional, enter 0 if not needed): ");
        int num3 = scanner.nextInt();

        if (num3 == 0) {
            System.out.println("Sum of two numbers: " + add(num1, num2));
        } else {
            System.out.println("Sum of three numbers: " + add(num1, num2, num3));
        }

        scanner.close();
    }
}
