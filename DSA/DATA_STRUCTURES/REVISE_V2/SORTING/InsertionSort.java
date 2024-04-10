package DSA.DATA_STRUCTURES.REVISE_V2.SORTING;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Unsorted Array:\n" + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted Array:\n" + Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int ele = arr[i], j;
            for (j = i - 1; j >= 0 && ele < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = ele;
        }
    }
}
