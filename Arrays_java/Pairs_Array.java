package Arrays_java;

public class Pairs_Array {
    public static void printPairs(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4,5};
        System.out.println("All pairs in the array:");
        printPairs(numbers);
    }
}
