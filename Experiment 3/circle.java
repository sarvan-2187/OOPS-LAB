import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
    Scanner tool = new Scanner(System.in);
    System.out.println("Enter the Radius of Circle: ");
    double radius = tool.nextInt();
    double area = (3.14*radius*radius);
    System.out.println("The Area is: "+ area);
    tool.close();
}
}