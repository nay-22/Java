package DSA.DATA_STRUCTURES.REVISE_V2.SORTING;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Unsorted Array:\n" + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted Array:\n" + Arrays.toString(arr));

    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int midx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[midx]) {
                    midx = j;
                }
            }
            int temp = arr[midx];
            arr[midx] = arr[i];
            arr[i] = temp;
        }
    }
}
