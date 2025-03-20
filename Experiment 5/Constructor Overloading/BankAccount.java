import java.util.Scanner;

class BankAccount {
    String accountHolder;
    double balance;

    BankAccount() {
        this.accountHolder = "Unknown";
        this.balance = 0.0;
    }

    BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 5000; 
    }

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc1 = new BankAccount();
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        BankAccount acc2 = new BankAccount(name);

        System.out.print("Enter Initial Deposit: ");
        double deposit = sc.nextDouble();
        BankAccount acc3 = new BankAccount(name, deposit);
        
        System.out.println("\nDefault Account:");
        acc1.display();
        
        System.out.println("\nAccount with Name:");
        acc2.display();

        System.out.println("\nAccount with Initial Deposit:");
        acc3.display();

        sc.close();
    }
}
