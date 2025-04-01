import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriteExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("buffered.txt"))) {
            System.out.print("Enter number of lines: ");
            int lines = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < lines; i++) {
                System.out.print("Enter line " + (i+1) + ": ");
                writer.write(scanner.nextLine());
                writer.newLine();
            }
            System.out.println("File written successfully");
        } catch (java.io.IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        scanner.close();
    }
}
