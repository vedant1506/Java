package Patterns_java;

public class Inverted_Rotated_half_Pyramid {
    public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_rotated_half_pyramid(5);
    }
}
