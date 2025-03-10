import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (N): ");
        int n = sc.nextInt();
        
        int sum = 0, i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        sc.close();
    }
}
