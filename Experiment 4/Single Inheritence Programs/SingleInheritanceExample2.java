import java.util.Scanner;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void showAnimalDetails() {
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    void showDogDetails() {
        showAnimalDetails();
        System.out.println("Breed: " + breed);
    }
}

public class SingleInheritanceExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Dog Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Breed: ");
        String breed = sc.nextLine();

        Dog dog = new Dog(name, breed);

        System.out.println("\nDog Details:");
        dog.showDogDetails();

        sc.close();
    }
}
