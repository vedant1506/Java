package Funcions_java;

public class product {

    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int result = multiply(num1, num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + result);
    }
}