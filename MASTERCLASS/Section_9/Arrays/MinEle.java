package MASTERCLASS.Section_9.Arrays;

import java.util.Scanner;

public class MinEle {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int count = in.nextInt();
        int[] arr = readIntegers(count);
        int min = findMin(arr);
        System.out.println(min);
    }

    public static int[] readIntegers(int count) {
        int[] arr = new int[count];
        for(int i=0; i<count; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
