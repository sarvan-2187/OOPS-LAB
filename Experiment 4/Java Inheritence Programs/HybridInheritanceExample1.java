import java.util.Scanner;

class Animal {
    String species;

    void getSpecies(Scanner sc) {
        System.out.print("Enter species: ");
        species = sc.nextLine();
    }

    void displaySpecies() {
        System.out.println("Species: " + species);
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println(species + " can fly.");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println(species + " can swim.");
    }
}

class Penguin extends Bird {
    void cannotFly() {
        System.out.println(species + " is a bird but cannot fly.");
    }
}

public class HybridInheritanceExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Penguin penguin = new Penguin();
        penguin.getSpecies(sc);
        penguin.displaySpecies();
        penguin.fly();
        penguin.cannotFly();

        Fish fish = new Fish();
        fish.getSpecies(sc);
        fish.displaySpecies();
        fish.swim();
        
        sc.close();
    }
}
