import java.util.Scanner;

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class AbstractExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to hear a dog's sound? (yes/no): ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("yes")) {
            Animal myDog = new Dog();
            myDog.sound();
        } else {
            System.out.println("No sound for now.");
        }

        scanner.close();
    }
}
