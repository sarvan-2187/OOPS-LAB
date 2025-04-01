import utilities.StringUtils;

public class UserDefinedPackageExample2 {
    public static void main(String[] args) {
        StringUtils utils = new StringUtils();
        
        String text1 = "Hello, World!";
        String text2 = "A man, a plan, a canal: Panama";
        String text3 = "this is a test string for capitalization";
        
        System.out.println("String Utilities Example:");
        
        System.out.println("\nReverse:");
        System.out.println("Original: " + text1);
        System.out.println("Reversed: " + utils.reverse(text1));
        
        System.out.println("\nPalindrome Check:");
        System.out.println("\"" + text1 + "\" is a palindrome: " + utils.isPalindrome(text1));
        System.out.println("\"" + text2 + "\" is a palindrome: " + utils.isPalindrome(text2));
        
        System.out.println("\nWord Count:");
        System.out.println("\"" + text1 + "\" has " + utils.countWords(text1) + " words");
        System.out.println("\"" + text3 + "\" has " + utils.countWords(text3) + " words");
        
        System.out.println("\nCapitalize Words:");
        System.out.println("Original: " + text3);
        System.out.println("Capitalized: " + utils.capitalizeWords(text3));
        
        System.out.println("\nEmpty String Tests:");
        System.out.println("Empty string word count: " + utils.countWords(""));
        System.out.println("Empty string capitalization: \"" + utils.capitalizeWords("") + "\"");
    }
}
