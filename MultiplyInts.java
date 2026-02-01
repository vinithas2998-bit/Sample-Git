public class MultiplyInts {

    /**
     * Multiplies two integers and returns the product
     * @param a first integer
     * @param b second integer
     * @return product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }   

    /**
     * Main method demonstrating multiplication
     */
    public static void main(String[] args) {
        MultiplyInts m = new MultiplyInts();
        int prod1 = m.multiply(4, 5);
        System.out.println("Product of 4 and 5: " + prod1);

        int prod2 = m.multiply(-3, 7);
        System.out.println("Product of -3 and 7: " + prod2);
    }
}
