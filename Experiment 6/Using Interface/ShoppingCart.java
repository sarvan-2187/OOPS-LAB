import java.util.Scanner;

interface Product {
    void display();
}

class Electronics implements Product {
    String name;
    double price;

    Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Electronics: " + name + " - $" + price);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        Product prod = new Electronics(name, price);
        prod.display();

        sc.close();
    }
}
