package bascis_of_java;
import java.util.*;
public class sum_a_and_b {
    public static void main(String[] args) {
        // int a1 = 5;
        // int b1 = 7;
        // int sum1 = a1 + b1;
        // System.out.println("The sum of a and b is: " + sum1);



        //sum with input from user
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of a and b is: " + sum);
        sc.close();

    }
}
