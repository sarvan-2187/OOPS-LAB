import banking.SavingsAccount;
import banking.CheckingAccount;

public class UserDefinedPackageExample4 {
    public static void main(String[] args) {
        System.out.println("Banking System Example:");
        
        SavingsAccount savings = new SavingsAccount("SAV001", "John Doe", 1000.00, 2.5);
        CheckingAccount checking = new CheckingAccount("CHK001", "Jane Smith", 500.00, 200.00);
        
        System.out.println("\n--- Savings Account Details ---");
        System.out.println(savings.getAccountDetails());
        
        System.out.println("\n--- Checking Account Details ---");
        System.out.println(checking.getAccountDetails());
        
        System.out.println("\n--- Savings Account Transactions ---");
        savings.deposit(500.00);
        
        try {
            savings.withdraw(200.00);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        savings.addInterest();
        
        System.out.println("\n--- Checking Account Transactions ---");
        checking.deposit(100.00);
        
        System.out.println("\nAttempt to withdraw within overdraft limit:");
        try {
            checking.withdraw(700.00);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\nAttempt to withdraw exceeding overdraft limit:");
        try {
            checking.withdraw(1000.00);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\nException Handling Examples:");
        try {
            savings.withdraw(-100.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
