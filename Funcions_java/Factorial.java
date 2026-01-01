package Funcions_java;

public class Factorial {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 10;
        int result = factorial(num);
        System.out.println("The factorial of " + num + " is: " + result);   
    }
}
