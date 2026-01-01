package bascis_of_java;

import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        System.out.println("Choose an operation: +, -, *, /");
        char operation = sc.next().charAt(0);

        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation");
                sc.close();
                return;
        }

        System.out.println("The result is: " + result);
        sc.close();
    }
}