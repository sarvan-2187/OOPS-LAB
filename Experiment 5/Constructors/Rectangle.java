import java.util.Scanner;

class Rectangle {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length of the Rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter Width of the Rectangle: ");
        double width = sc.nextDouble();

        Rectangle rect = new Rectangle(length, width);
        System.out.println("Area of Rectangle: " + rect.calculateArea());

        sc.close();
    }
}
