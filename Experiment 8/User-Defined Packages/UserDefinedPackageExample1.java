import mathematics.MathOperations;

public class UserDefinedPackageExample1 {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        
        int sum = math.add(10, 5);
        int difference = math.subtract(20, 8);
        int product = math.multiply(6, 7);
        double quotient = math.divide(50, 4);
        int powerResult = math.power(2, 8);
        
        System.out.println("Mathematics Operations Example:");
        System.out.println("Addition: 10 + 5 = " + sum);
        System.out.println("Subtraction: 20 - 8 = " + difference);
        System.out.println("Multiplication: 6 × 7 = " + product);
        System.out.println("Division: 50 ÷ 4 = " + quotient);
        System.out.println("Power: 2^8 = " + powerResult);
        
        try {
            double result = math.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("\nCaught exception: " + e.getMessage());
        }
    }
}
