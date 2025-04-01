import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class BuiltinPackageExample2 {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");
            
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            
            FileWriter writer = new FileWriter(file);
            writer.write("This is a demonstration of the java.io package.\n");
            writer.write("File handling is an important part of Java programming.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
            
            System.out.println("\nContents of the file:");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            
            System.out.println("\nFile Information:");
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Can read: " + file.canRead());
            System.out.println("Can write: " + file.canWrite());
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
