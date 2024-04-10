package Step_2.Step_2_1;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,7,1,2,9,3,8};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int t = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = t;
                j--;
            }
        }
    }
}
