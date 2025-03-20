import java.util.Scanner;

class Vehicle {
    String brand;
    int wheels;

    Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    void showVehicleDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Wheels: " + wheels);
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, int wheels, String fuelType) {
        super(brand, wheels);
        this.fuelType = fuelType;
    }

    void showCarDetails() {
        showVehicleDetails();
        System.out.println("Fuel Type: " + fuelType);
    }
}

class SportsCar extends Car {
    int maxSpeed;

    SportsCar(String brand, int wheels, String fuelType, int maxSpeed) {
        super(brand, wheels, fuelType);
        this.maxSpeed = maxSpeed;
    }

    void showSportsCarDetails() {
        showCarDetails();
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

public class MultilevelInheritanceExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car Brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter Number of Wheels: ");
        int wheels = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Fuel Type: ");
        String fuelType = sc.nextLine();
        System.out.print("Enter Max Speed: ");
        int maxSpeed = sc.nextInt();

        SportsCar sportsCar = new SportsCar(brand, wheels, fuelType, maxSpeed);

        System.out.println("\nSports Car Details:");
        sportsCar.showSportsCarDetails();

        sc.close();
    }
}
