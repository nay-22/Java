package DSA.scratch;

import java.util.Arrays;

public class equipoint {
    public static void main(String[] args) {
        int[] arr = {1,2,6,4,0,-1};
        int i = getEquiPoint(arr);
        System.out.println("Equilibrium Point = " + arr[i]);
        System.out.println("Equilibrium Index = " + i);
    }

    public static int getEquiPoint(int[] arr) {
        int[] sum = new int[arr.length];
        sum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum[i] = sum[i-1] + arr[i];
        }
        for (int i = 1; i < arr.length - 1; i++) {
            int lSum = sum[i] - arr[i];
            int rSum = sum[arr.length-1] - sum[i];
            if (lSum == rSum) return i;
        }
        return -1;
    }
}
