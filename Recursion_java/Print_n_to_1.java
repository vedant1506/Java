package Recursion_java;



public class Print_n_to_1 {
    public static void main(String[] args) {
        int n = 5; // Example input
        printNto1(n);
    }


        public static void printNto1(int n) {
        // Base case
        if (n == 0) {
            return;
        }
        // Print current number
        System.out.println(n);
        // Recursive call with decremented value
        printNto1(n - 1);
    }
}