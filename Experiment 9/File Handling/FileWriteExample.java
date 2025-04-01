import java.io.FileWriter;
import java.util.Scanner;

public class FileWriteExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("output.txt");
            System.out.print("Enter text to write: ");
            String text = scanner.nextLine();
            writer.write(text);
            writer.close();
            System.out.println("Successfully wrote to file");
        } catch (java.io.IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        scanner.close();
    }
}
