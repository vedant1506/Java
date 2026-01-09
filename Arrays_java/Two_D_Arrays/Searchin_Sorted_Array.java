package Arrays_java.Two_D_Arrays;

public class Searchin_Sorted_Array {
public static int searchMatrix(int[][] matrix, int target) {
    int row = 0 , col = matrix[0].length - 1;   
    while(row < matrix.length && col >= 0){
        if(matrix[row][col] == target){
            System.out.println("Element found at position: (" + row + ", " + col + ")");
            return 1;
        }
        else if(matrix[row][col] < target){
            row++;
        }
        else{
            col--;
        }
    }
    return 0;
}
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 16;
        int result = searchMatrix(matrix, target);
        if (result == 1) {
            System.out.println("Target found in the matrix.");
        } else {
            System.out.println("Target not found in the matrix.");
        }
    }
}