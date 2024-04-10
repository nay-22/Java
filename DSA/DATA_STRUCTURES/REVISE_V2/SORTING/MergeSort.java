package DSA.DATA_STRUCTURES.REVISE_V2.SORTING;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 66, 13, 81, 45, 32, 99, 16, 2, 6, 15, 1};
        System.out.println("Unsorted Array:\n" + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array:\n" + Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[arr.length];
        int i = left, k = left, j = mid + 1;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (k = left; k <= right; k++) {
            arr[k] = temp[k];
        }
    }
}
