import java.util.*;
public class voting{
    public static void main(String[] args){
        Scanner tool = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = tool.nextInt();
        if (age>=18){
            System.out.println("You Can Vote");
        } else{
            System.out.println("You Cannot Vote");
        }
        tool.close();
        } 
}