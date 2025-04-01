import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileCopyExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter source file name: "); //source.txt
            String source = scanner.nextLine();
            System.out.print("Enter destination file name: "); //destination.txt
            String destination = scanner.nextLine();
            
            FileReader reader = new FileReader(source);
            FileWriter writer = new FileWriter(destination);
            
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            
            reader.close();
            writer.close();
            System.out.println("File copied successfully");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: File not found");
        } catch (java.io.IOException e) {
            System.out.println("Error during file operation: " + e.getMessage());
        }
        scanner.close();
    }
}
