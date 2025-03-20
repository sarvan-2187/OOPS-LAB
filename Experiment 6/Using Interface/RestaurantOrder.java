import java.util.Scanner;

interface Order {
    void placeOrder();
}

class FoodOrder implements Order {
    String item;
    double price;

    FoodOrder(String item, double price) {
        this.item = item;
        this.price = price;
    }

    public void placeOrder() {
        System.out.println("Order placed for " + item + " - $" + price);
    }
}

public class RestaurantOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Food Item: ");
        String item = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Order order = new FoodOrder(item, price);
        order.placeOrder();

        sc.close();
    }
}
