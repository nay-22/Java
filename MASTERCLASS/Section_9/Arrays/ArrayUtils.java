package MASTERCLASS.Section_9.Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] arr1 = getRandomArray(10);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("Ascending: " + Arrays.toString(arr1));

//        System.out.println("Descending: " + Arrays.toString(arr1));

        int[] arr2 = new int[10];
        System.out.println(Arrays.toString(arr2));
        Arrays.fill(arr2, 5);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = getRandomArray(10);
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = Arrays.copyOf(arr3, arr3.length);
        System.out.println(Arrays.toString(arr3));

        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));

        int[] largeArray = Arrays.copyOf(arr4, 15);
        System.out.println(Arrays.toString(largeArray));
    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(30);
        }
        return arr;
    }
}
