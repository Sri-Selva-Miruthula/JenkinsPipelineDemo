public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Addition: " + c.add(10, 20));
        System.out.println("Multiplication: " + c.multiply(5, 4));
    }
}