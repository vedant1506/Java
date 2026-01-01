package Funcions_java;

import java.util.Scanner;

public class bionomial_Coeff {
    public static int fact(int n) {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int sub = n - r ;

        if(n < r) {
            System.out.println("Factorial not possible");
        }

        else {
             int BioCoeff = fact(n) / (fact(r) * fact(sub));
            System.out.println("Bionomial Coefficient is: " + BioCoeff);
        }
        sc.close();
    }
}
