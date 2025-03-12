import java.util.Scanner;

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Bow Bow!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

public class MethodOverridingExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter animal type (Dog/Cat): ");
        String animalType = scanner.nextLine();
        
        Animal animal;
        if (animalType.equalsIgnoreCase("Dog")) {
            animal = new Dog();
        } else if (animalType.equalsIgnoreCase("Cat")) {
            animal = new Cat();
        } else {
            System.out.println("Unknown animal. Defaulting to generic animal.");
            animal = new Animal();
        }
        
        animal.makeSound();
        
        scanner.close();
    }
}
