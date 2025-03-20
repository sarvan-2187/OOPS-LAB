import java.util.Scanner;

class Appliance {
    String brand;

    void getBrand(Scanner sc) {
        System.out.print("Enter appliance brand: ");
        brand = sc.nextLine();
    }

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

class WashingMachine extends Appliance {
    void washClothes() {
        System.out.println(brand + " washing machine is washing clothes.");
    }
}

class SmartWashingMachine extends WashingMachine {
    void smartWash() {
        System.out.println(brand + " smart washing machine optimizes water usage.");
    }
}

public class MultilevelInheritanceExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        SmartWashingMachine machine = new SmartWashingMachine();
        machine.getBrand(sc);
        machine.displayBrand();
        machine.washClothes();
        machine.smartWash();
        
        sc.close();
    }
}
