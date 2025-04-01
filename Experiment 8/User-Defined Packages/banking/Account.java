package banking;

public abstract class Account {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;
    
    public Account(String accountNumber, String accountHolder, double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }
    
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("New Balance: $" + balance);
    }
    
    public abstract void withdraw(double amount);
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolder() {
        return accountHolder;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountDetails() {
        return "Account Number: " + accountNumber + 
               "\nAccount Holder: " + accountHolder +
               "\nCurrent Balance: $" + balance;
    }
}
