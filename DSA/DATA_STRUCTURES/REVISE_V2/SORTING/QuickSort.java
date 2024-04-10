package DSA.DATA_STRUCTURES.REVISE_V2.SORTING;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 66, 13, 81, 45, 32, 99, 16, 2, 6, 15, 1};
        System.out.println("Unsorted Array:\n" + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array:\n" + Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int j = partition(arr, low, high);
            quickSort(arr, low, j - 1);
            quickSort(arr, j + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1; // pivot index
    }
}
