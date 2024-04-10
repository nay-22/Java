package MASTERCLASS.Test;

public class Kadane {
    public static void main(String[] args) {
        int[] arr = {-2, 3, -5, 2, 2, -1, 4, 3};
        System.out.println("Maximum Sum = " + getMaxSum(arr));
    }

    private static int getMaxSum(int[] arr) {
        int globalMax = Integer.MIN_VALUE;
        int localMax = 0;
        for (int num : arr) {
            localMax = Math.max(num, num + localMax);
            globalMax = Math.max(localMax, globalMax);
        }
        return globalMax;
    }
}
