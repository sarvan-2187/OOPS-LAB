import java.util.*;
public class cubeVol{
    public static void main(String[] args) {
        Scanner tool = new Scanner(System.in);
        System.out.println("Enter the length of cube: ");
        double length = tool.nextDouble();
        double volume = (length*length*length);
        System.out.println("The volume of Cube is: " +volume);
        tool.close();
    }
}