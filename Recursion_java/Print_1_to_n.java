package Recursion_java;

public class Print_1_to_n {
    public static void main(String[] args) {
        int n = 5; // Example input
        print1toN(n);
    }

    public static void print1toN(int n) {
        // Base case
        if (n == 1) {
            System.out.println(n+"");
            return;
        }
        // Recursive call with decremented value
        print1toN(n - 1);
        // Print current number
        System.out.println(n);
    }
}
