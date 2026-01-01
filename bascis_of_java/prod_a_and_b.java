package bascis_of_java;
import java.util.*;
public class prod_a_and_b {
    public static void main(String[] args) {


        //sum with input from user
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        System.out.println("The product of a and b is: " + product);
        sc.close();

    }
}

