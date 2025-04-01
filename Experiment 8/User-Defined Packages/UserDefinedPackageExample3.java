import geometry.Circle;
import geometry.Rectangle;
import geometry.Shape;

public class UserDefinedPackageExample3 {
    public static void main(String[] args) {
        System.out.println("Geometry Shapes Example:");
        
        Circle circle = new Circle(5.0);
        System.out.println("\nCircle with radius 5.0:");
        System.out.println("Area: " + String.format("%.2f", circle.area()));
        System.out.println("Perimeter: " + String.format("%.2f", circle.perimeter()));
        System.out.println("Diameter: " + String.format("%.2f", circle.getDiameter()));
        
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("\nRectangle with length 4.0 and width 6.0:");
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println("Is Square? " + rectangle.isSquare());
        System.out.println("Diagonal: " + String.format("%.2f", rectangle.getDiagonal()));
        
        Rectangle square = new Rectangle(5.0, 5.0);
        System.out.println("\nSquare with side 5.0:");
        System.out.println("Area: " + square.area());
        System.out.println("Perimeter: " + square.perimeter());
        System.out.println("Is Square? " + square.isSquare());
        
        System.out.println("\nDemonstrating polymorphism:");
        Shape shape1 = new Circle(3.0);
        Shape shape2 = new Rectangle(3.0, 4.0);
        
        System.out.println("Shape1 (Circle) Area: " + String.format("%.2f", shape1.area()));
        System.out.println("Shape2 (Rectangle) Area: " + shape2.area());
        
        try {
            Circle invalidCircle = new Circle(-1.0);
        } catch (IllegalArgumentException e) {
            System.out.println("\nCaught exception: " + e.getMessage());
        }
    }
}
