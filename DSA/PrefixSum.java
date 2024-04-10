package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};
        int[] prefixSum = fillPrefixSum(arr);
        System.out.println("Array Elements:");
        System.out.println(Arrays.toString(arr));
        System.out.println("prefixSum Array:");
        System.out.println(Arrays.toString(prefixSum));
        System.out.println();

        int m = 3;
        Pair[] pairs = {new Pair(2, 4), new Pair(1, 3), new Pair(1, 2)};
        System.out.println("Highest Element: " + findHighest(m, pairs));
    }

    public static int[] fillPrefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }


    /* Consider an array of size N with all initial values as 0. Perform the given
       m’ add operations from index ‘a’ to ‘b’ and evaluate the highest element in the
       array. An add operation adds 100 to all the elements from a to b (both inclusive).*/
    static class Pair {
        int a;
        int b;
        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
    public static int findHighest(int m, Pair[] pairs) {
        int highest = 0;
        int[] pre = new int[5];
        for (int i = 0; i < m; i++) {
            pre[pairs[i].a - 1] += 100;
            pre[pairs[i].b] -= 100;
        }
        for (int i = 1; i < pre.length; i++) {
            pre[i] += pre[i - 1];
            highest = Math.max(highest, pre[i]);
        }
        return highest;
    } // O(N+M)



}
