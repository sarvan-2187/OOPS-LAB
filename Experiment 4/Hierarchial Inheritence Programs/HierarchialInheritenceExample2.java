import java.util.Scanner;

// Parent class
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// Child class 1
class Manager extends Employee {
    int teamSize;

    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    void showManagerDetails() {
        display();
        System.out.println("Team Size: " + teamSize);
    }
}

// Child class 2
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void showDeveloperDetails() {
        display();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class HierarchialInheritenceExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Manager Name: ");
        String managerName = sc.nextLine();
        System.out.print("Enter Manager Salary: ");
        double managerSalary = sc.nextDouble();
        System.out.print("Enter Team Size: ");
        int teamSize = sc.nextInt();
        sc.nextLine(); // Consume newline
        Manager manager = new Manager(managerName, managerSalary, teamSize);

        System.out.print("Enter Developer Name: ");
        String developerName = sc.nextLine();
        System.out.print("Enter Developer Salary: ");
        double developerSalary = sc.nextDouble();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Programming Language: ");
        String programmingLanguage = sc.nextLine();
        Developer developer = new Developer(developerName, developerSalary, programmingLanguage);

        System.out.println("\nManager Details:");
        manager.showManagerDetails();

        System.out.println("\nDeveloper Details:");
        developer.showDeveloperDetails();

        sc.close();
    }
}
