import java.io.FileReader;
import java.util.Scanner;

public class FileReadExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter file name to read: "); //read.txt
            String fileName = scanner.nextLine();
            FileReader reader = new FileReader(fileName);
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char)character);
            }
            reader.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: File not found");
        } catch (java.io.IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        scanner.close();
    }
}
