import java.util.Scanner;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void checkAge(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Age must be 18 or older");
        }
        System.out.println("Age is valid");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            checkAge(age);
        } catch (MyException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
        scanner.close();
    }
}
