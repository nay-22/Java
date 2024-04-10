package Step_2.Step_2_2;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,7,1,2,9,3,8};
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            sort(arr, start, pivot - 1);
            sort(arr, pivot + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[start], i = start, j = end;
        while (i < j) {
            while (arr[i] <= pivot && i <= end - 1) i++;
            while (arr[j] > pivot && j >= start + 1) j--;
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t = arr[start];
        arr[start] = arr[j];
        arr[j] = t;
        return j;
    }
}
