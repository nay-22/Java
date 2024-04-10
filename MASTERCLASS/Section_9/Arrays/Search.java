package MASTERCLASS.Section_9.Arrays;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.getRandomArray(15);
        System.out.println("Array: " + Arrays.toString(arr));
        if (Arrays.binarySearch(arr, 15) >= 0) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};

        if (Arrays.equals(a1, a2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
