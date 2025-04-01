import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println("You entered: " + num);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer");
        } finally {
            System.out.println("Program finished");
        }
        scanner.close();
    }
}
