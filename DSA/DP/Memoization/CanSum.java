package DSA.DP.Memoization;

import java.util.HashMap;
import java.util.Map;

public class CanSum {
    public static void main(String[] args) {
        System.out.println("Brute Force canSum():");
        System.out.println(canSum(7, new int[]{5,4,3,7}));
        System.out.println(canSum(7, new int[]{2,4}));
        System.out.println(canSum(8, new int[]{2,3,5}));
        System.out.println(canSum(300, new int[]{7, 14}));

        System.out.println("Memoized canSum():");
        System.out.println(canSumMemoized(7, new int[]{5,4,3,7}));
        System.out.println(canSumMemoized(7, new int[]{2,4}));
        System.out.println(canSumMemoized(8, new int[]{2,3,5}));
        System.out.println(canSumMemoized(300, new int[]{7, 14}));


    }

    public static boolean canSum(int t, int[] nums) {
        if (t == 0) return true;
        if (t < 0) return false;
        for (int num : nums) {
            int remainder = t - num;
            if (canSum(remainder, nums)) return true;
        }
        return false;
    }

    public static boolean canSumMemoized(int t, int[] nums) {
        Map<Integer, Boolean> memo = new HashMap<>();
        return canSumMemoized(t, nums, memo);
    }
    private static boolean canSumMemoized(int t, int[] nums, Map<Integer, Boolean> memo) {
        if (memo.containsKey(t)) return memo.get(t);
        if (t == 0) return true;
        if (t < 0) return false;
        for (int num : nums) {
            int remainder = t - num;
            if (canSum(remainder, nums)) {
                memo.put(t, true);
                return true;
            }
        }
        memo.put(t, false);
        return false;
    }
}
