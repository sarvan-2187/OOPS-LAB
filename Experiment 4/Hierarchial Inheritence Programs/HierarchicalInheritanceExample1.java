import java.util.Scanner;

class Vehicle {
    String name;

    void getName(Scanner sc) {
        System.out.print("Enter vehicle name: ");
        name = sc.nextLine();
    }

    void displayName() {
        System.out.println("Vehicle Name: " + name);
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println(name + " is driving.");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println(name + " is riding.");
    }
}

public class HierarchicalInheritanceExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Car car = new Car();
        car.getName(sc);
        car.displayName();
        car.drive();

        Bike bike = new Bike();
        bike.getName(sc);
        bike.displayName();
        bike.ride();
        
        sc.close();
    }
}
