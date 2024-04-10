package DSA.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static List<Integer> arr = new ArrayList<>(Arrays.asList(6,4,1,8,2,9,3));
    public static void main(String[] args) {
//        System.out.println(arr);
        mergeSort(0, arr.size() - 1);
        System.out.println(arr);
    }
    private static void mergeSort(int low, int high) {
        if (low < high) {
            System.out.println(arr);
            int mid = (low + high)/2;
            System.out.println(mid);
            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            merge(low, mid, high);
        }
    }
    private static void merge(int low, int mid, int high) {
        int i = low, k = low, j = mid + 1;
        List<Integer> temp = new ArrayList<>(arr.size());
        while (i <= mid && j <= high) {
            if (arr.get(i) < arr.get(j)) {
                temp.set(k++, arr.get(i++));
            } else {
                temp.set(k++, arr.get(j++));
            }
        }
        while (i <= mid) temp.set(k++, arr.get(i++));
        while (j <= high) temp.set(k++, arr.get(j++));
        for (k = low; k <= high; k++) {
            arr.set(k, temp.get(k));
        }
    }
}
