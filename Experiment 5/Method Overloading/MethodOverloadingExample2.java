import java.util.Scanner;

public class MethodOverloadingExample2 {

    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (integer or decimal): ");
        if (scanner.hasNextInt()) {
            int num1 = scanner.nextInt();
            System.out.print("Enter second number (integer): ");
            int num2 = scanner.nextInt();
            System.out.println("Product of two integers: " + multiply(num1, num2));
        } else {
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number (decimal): ");
            double num2 = scanner.nextDouble();
            System.out.println("Product of two doubles: " + multiply(num1, num2));
        }

        scanner.close();
    }
}
