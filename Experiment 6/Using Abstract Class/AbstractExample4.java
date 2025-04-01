import java.util.Scanner;

abstract class Calculator {
    abstract void add(int a, int b);
    abstract void subtract(int a, int b);
}

class SimpleCalculator extends Calculator {
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Difference: " + (a - b));
    }
}

public class AbstractExample4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.add(num1, num2);
        calculator.subtract(num1, num2);

        scanner.close();
    }
}
