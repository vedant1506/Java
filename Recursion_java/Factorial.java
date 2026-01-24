package Recursion_java;

public class Factorial {
    public static void main(String[] args) {
        int n = 5; // Example input
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static int factorial(int n) {
        // Base case
        if (n == 0) {
            return 1;
        }
        // Recursive call
        return n * factorial(n - 1);
    }
}
