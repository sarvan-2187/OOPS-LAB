
package utilities;

public class StringUtils {
    public String reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
    
    public boolean isPalindrome(String input) {
        String cleanInput = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = reverse(cleanInput);
        return cleanInput.equals(reversed);
    }
    
    public int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        return input.trim().split("\\s+").length;
    }
    
    public String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        StringBuilder result = new StringBuilder();
        String[] words = input.split("\\s+");
        
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        
        return result.toString().trim();
    }
}
