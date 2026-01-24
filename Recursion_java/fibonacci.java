package Recursion_java;

public class fibonacci {

    public static void main(String[] args) {
        int n = 5; // Example input
        int result = calcSum(n);
        System.out.println("Fibonacci of " + n + " is: " + result);
    }
    
    public static int calcSum(int n) {
        // Base case
        if (n <= 1) {
            return n;
        }
        // Recursive call
        return calcSum(n - 1) + calcSum(n - 2);
    }
}
