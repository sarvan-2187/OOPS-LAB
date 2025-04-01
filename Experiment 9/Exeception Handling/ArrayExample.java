import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = {"1", "2", "3"};
        try {
            System.out.print("Enter index: ");
            int index = scanner.nextInt();
            System.out.println(numbers[index]);
            System.out.print("Enter a number: ");
            int num = Integer.parseInt(scanner.next());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        } finally {
            System.out.println("Execution completed");
        }
        scanner.close();
    }
}
