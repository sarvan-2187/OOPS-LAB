import java.util.Scanner;

abstract class Shape {
    int x, y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract void area();
}

class Rectangle extends Shape {
    Rectangle(int x, int y) {
        super(x, y);
    }

    void area() {
        System.out.println("Area of rectangle: " + (x * y));
    }
}

public class AbstractExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();

        Shape rectangle = new Rectangle(length, width);
        rectangle.area();

        scanner.close();
    }
}
