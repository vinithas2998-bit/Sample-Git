public class AddNumbers {
    
    /**
     * Adds two numbers and returns the sum
     * @param num1 the first number
     * @param num2 the second number
     * @return the sum of num1 and num2
     */
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    
    /**
     * Adds two double numbers and returns the sum
     * @param num1 the first number
     * @param num2 the second number
     * @return the sum of num1 and num2
     */
    public double add(double num1, double num2) {
        return num1 + num2;
    }
    
    /**
     * Main method to demonstrate the AddNumbers class
     */
    public static void main(String[] args) {
        AddNumbers adder = new AddNumbers();
        
        // Adding integers
        int result1 = adder.add(5, 10);
        System.out.println("Sum of 5 and 10: " + result1);
        
        // Adding doubles
        double result2 = adder.add(3.5, 2.5);
        System.out.println("Sum of 3.5 and 2.5: " + result2);
    }
}
