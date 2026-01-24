package Recursion_java;

public class sum_of_n_numbs {
    public static void main(String[] args) {
        int n = 5;
        printSumTillN(n);
    }

    public static int printSumTillN(int n) {

        if(n==1) {
            return 1;
        }

        int sum = n + printSumTillN(n - 1);
        System.out.println("Sum till " + n + " is: " + sum);
        return sum;
    }
}
