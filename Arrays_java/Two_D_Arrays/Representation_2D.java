package Arrays_java.Two_D_Arrays;

import java.util.Scanner;

public class Representation_2D {
    public static void main(String[] args) {
        int matrix[][]= new int [3][3];
        int n = matrix.length; // number of rows
        int m = matrix[0].length; // number of columns

        // Initializing the 2D array
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Printing the 2D array
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}