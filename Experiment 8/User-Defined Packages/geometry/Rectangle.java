package geometry;

public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Dimensions cannot be negative");
        }
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double area() {
        return length * width;
    }
    
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
    
    public boolean isSquare() {
        return length == width;
    }
    
    public double getDiagonal() {
        return Math.sqrt(length * length + width * width);
    }
    
    // Getters and setters
    public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length cannot be negative");
        }
        this.length = length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width cannot be negative");
        }
        this.width = width;
    }
}
