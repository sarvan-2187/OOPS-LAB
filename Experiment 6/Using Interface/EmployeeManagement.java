import java.util.Scanner;

interface Employee {
    void showEmployeeDetails();
}

class Manager implements Employee {
    String name;
    int salary;

    Manager(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showEmployeeDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Manager Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();

        Employee emp = new Manager(name, salary);
        emp.showEmployeeDetails();

        sc.close();
    }
}
