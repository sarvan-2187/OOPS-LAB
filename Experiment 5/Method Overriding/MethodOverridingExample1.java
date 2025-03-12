import java.util.Scanner;

class Bank {
    double getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 5.5;
    }
}

class HDFC extends Bank {
    @Override
    double getRateOfInterest() {
        return 6.0;
    }
}

public class MethodOverridingExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter bank name (SBI/HDFC): ");
        String bankName = scanner.nextLine();
        
        Bank bank;
        if (bankName.equalsIgnoreCase("SBI")) {
            bank = new SBI();
        } else if (bankName.equalsIgnoreCase("HDFC")) {
            bank = new HDFC();
        } else {
            System.out.println("Invalid bank name. Defaulting to Bank.");
            bank = new Bank();
        }
        
        System.out.println("Interest Rate: " + bank.getRateOfInterest() + "%");
        
        scanner.close();
    }
}
