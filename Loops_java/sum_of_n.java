package Loops_java;

import java.util.Scanner;

public class sum_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int sum = 0;

        while (count <= n) {
            sum = sum + count;
            count++;
            
        }
        System.out.println(sum);
sc.close();
    }
}
