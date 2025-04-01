package banking;

public class CheckingAccount extends Account {
    private double overdraftLimit;
    
    public CheckingAccount(String accountNumber, String accountHolder, 
                          double initialBalance, double overdraftLimit) {
        super(accountNumber, accountHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        
        if (amount > (balance + overdraftLimit)) {
            throw new IllegalStateException("Exceeds overdraft limit");
        }
        
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
        System.out.println("New Balance: $" + String.format("%.2f", balance));
        
        if (balance < 0) {
            System.out.println("Warning: Account is overdrawn!");
        }
    }
    
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    
    @Override
    public String getAccountDetails() {
        return super.getAccountDetails() + 
               "\nAccount Type: Checking" +
               "\nOverdraft Limit: $" + overdraftLimit;
    }
}
