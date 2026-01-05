package Arrays_java;

public class Largest_element {
    public static int findLargest(int[] arr) {
        int largest = arr[0]; // Assume the first element is the largest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest if current element is greater
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, 6};
        int largestElement = findLargest(numbers);
        System.out.println("The largest element in the array is: " + largestElement);
    }
}
