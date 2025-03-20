import java.util.Scanner;

// Base class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Intermediate class (Employee)
class Employee extends Person {
    int empID;

    Employee(String name, int age, int empID) {
        super(name, age);
        this.empID = empID;
    }

    void showEmployeeDetails() {
        showDetails();
        System.out.println("Employee ID: " + empID);
    }
}

// Derived class 1 (Professor)
class Professor extends Employee {
    String subject;

    Professor(String name, int age, int empID, String subject) {
        super(name, age, empID);
        this.subject = subject;
    }

    void showProfessorDetails() {
        showEmployeeDetails();
        System.out.println("Subject: " + subject);
    }
}

// Derived class 2 (Administrator)
class Administrator extends Employee {
    String department;

    Administrator(String name, int age, int empID, String department) {
        super(name, age, empID);
        this.department = department;
    }

    void showAdministratorDetails() {
        showEmployeeDetails();
        System.out.println("Department: " + department);
    }
}

// Additional Derived Class (HOD - Inherits Professor)
class HOD extends Professor {
    String researchArea;

    HOD(String name, int age, int empID, String subject, String researchArea) {
        super(name, age, empID, subject);
        this.researchArea = researchArea;
    }

    void showHODDetails() {
        showProfessorDetails();
        System.out.println("Research Area: " + researchArea);
    }
}

public class HybridInheritenceExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Professor details
        System.out.print("Enter Professor Name: ");
        String profName = sc.nextLine();
        System.out.print("Enter Age: ");
        int profAge = sc.nextInt();
        System.out.print("Enter Employee ID: ");
        int profID = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();
        Professor professor = new Professor(profName, profAge, profID, subject);

        // Taking Administrator details
        System.out.print("\nEnter Administrator Name: ");
        String adminName = sc.nextLine();
        System.out.print("Enter Age: ");
        int adminAge = sc.nextInt();
        System.out.print("Enter Employee ID: ");
        int adminID = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Department: ");
        String department = sc.nextLine();
        Administrator administrator = new Administrator(adminName, adminAge, adminID, department);

        // Taking HOD details
        System.out.print("\nEnter HOD Name: ");
        String hodName = sc.nextLine();
        System.out.print("Enter Age: ");
        int hodAge = sc.nextInt();
        System.out.print("Enter Employee ID: ");
        int hodID = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Subject: ");
        String hodSubject = sc.nextLine();
        System.out.print("Enter Research Area: ");
        String researchArea = sc.nextLine();
        HOD hod = new HOD(hodName, hodAge, hodID, hodSubject, researchArea);

        // Displaying Professor details
        System.out.println("\nProfessor Details:");
        professor.showProfessorDetails();

        // Displaying Administrator details
        System.out.println("\nAdministrator Details:");
        administrator.showAdministratorDetails();

        // Displaying HOD details
        System.out.println("\nHOD Details:");
        hod.showHODDetails();

        sc.close();
    }
}
