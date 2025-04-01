import java.util.ArrayList;

public class BuiltinPackageExample1 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("C++");
        
        System.out.println("Programming Languages List:");
        for (int i = 0; i < languages.size(); i++) {
            System.out.println((i+1) + ". " + languages.get(i));
        }
        
        System.out.println("\nTotal languages: " + languages.size());
        System.out.println("First language: " + languages.get(0));
        System.out.println("Contains Python? " + languages.contains("Python"));
        
        languages.remove("JavaScript");
        System.out.println("\nAfter removing JavaScript:");
        for (String lang : languages) {
            System.out.println("- " + lang);
        }
    }
}
