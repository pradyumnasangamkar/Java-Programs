public class Calculator {

    // Function to perform addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Function to perform subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int sum = add(num1, num2);          // calling add function
        int difference = subtract(num1, num2); // calling subtract function

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
    }
}
