public class factorial {
    public static void main(String[] args) {
        int n = 3; // Number to calculate factorial
        int fact = 1; // Variable to store factorial

        for (int i = 1; i <= n; i++) {
            fact *= i; // Multiply current value of fact by i
        }

        System.out.println("Factorial of " + n + " is: " + fact); // Print the result
    }
}
