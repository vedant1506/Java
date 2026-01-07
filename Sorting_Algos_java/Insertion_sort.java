package Sorting_Algos_java;

public class Insertion_sort {
    public static void InsertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            // find the correct position to insert current
            while(j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            // insert current at its correct position
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};
        InsertionSort(arr);
        // print the sorted array
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
