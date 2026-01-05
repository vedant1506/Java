package Arrays_java;

public class Reverse_array {
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        reverseArray(numbers);

        System.out.println("\nReversed array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
