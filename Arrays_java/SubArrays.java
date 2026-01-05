package Arrays_java;

public class SubArrays {
    public static void printSubArrays(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Print sub-array from index i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3,4};
        System.out.println("All sub-arrays of the array:");
        printSubArrays(numbers);
    }
}
