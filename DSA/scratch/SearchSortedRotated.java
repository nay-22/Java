package DSA.scratch;

import java.util.Arrays;
import java.util.Collections;

public class SearchSortedRotated {
    public static int search(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            if (arr[low] < arr[mid]) {
                if (key >= arr[low] && key < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (key > arr[mid] && key < arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,5,6};
        System.out.println(search(arr, 8));
    }
}
