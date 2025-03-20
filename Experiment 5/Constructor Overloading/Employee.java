import java.util.Scanner;

class Employee {
    String name;
    int age;
    double salary;

    Employee() {
        this.name = "Unknown";
        this.age = 0;
        this.salary = 0.0;
    }

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.salary = 30000;
    }

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        Employee e2 = new Employee(name, age);
        
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        Employee e3 = new Employee(name, age, salary);

        System.out.println("\nDefault Employee:");
        e1.display();
        
        System.out.println("\nEmployee with Name & Age:");
        e2.display();

        System.out.println("\nEmployee with All Details:");
        e3.display();

        sc.close();
    }
}
