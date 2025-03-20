import java.util.Scanner;

interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

class SavingsAccount implements Bank {
    double balance;

    SavingsAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        SavingsAccount acc = new SavingsAccount(balance);

        System.out.print("Enter amount to deposit: ");
        acc.deposit(sc.nextDouble());

        System.out.print("Enter amount to withdraw: ");
        acc.withdraw(sc.nextDouble());

        acc.showBalance();
        sc.close();
    }
}
