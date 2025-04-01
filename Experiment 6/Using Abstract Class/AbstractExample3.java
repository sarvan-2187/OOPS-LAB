import java.util.Scanner;

abstract class Vehicle {
    abstract void start();
    abstract void stop();

    void fuelType() {
        System.out.println("Vehicle uses petrol.");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting.");
    }

    void stop() {
        System.out.println("Car is stopping.");
    }
}

public class AbstractExample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to start the car? (yes/no): ");
        String input = scanner.nextLine();

        Vehicle myCar = new Car();

        if (input.equalsIgnoreCase("yes")) {
            myCar.start();
        } else {
            myCar.stop();
        }

        myCar.fuelType();

        scanner.close();
    }
}
