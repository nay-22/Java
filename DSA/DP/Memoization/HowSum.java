package DSA.DP.Memoization;

import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HowSum {
    public static void main(String[] args) {
//        System.out.println(howSum(7, new int[]{2,3}));
//        System.out.println(howSum(7, new int []{5, 3, 4, 7}));
//        System.out.println(howSum(7, new int[]{2, 4}));
//        System.out.println(howSum(8, new int[]{2, 3, 5}));
//        System.out.println(howSum(300, new int[]{7, 14}));

        System.out.println(howSum(7, new int[]{2,3}));
        System.out.println(howSumMemoized(7, new int []{5, 3, 4, 7}));
        System.out.println(howSumMemoized(7, new int[]{2, 4}));
        System.out.println(howSumMemoized(8, new int[]{2, 3, 5}));
        System.out.println(howSumMemoized(300, new int[]{7, 14}));
    }

    public static List<Integer> howSum(int target, int[] nums) {
        if (target == 0) return new ArrayList<Integer>();
        if (target < 0) return null;
        for (int num : nums) {
            int remainder = target - num;
            List<Integer> result = howSum(remainder, nums);
            if (result != null) {
                result.add(num);
                return result;
            }
        }
        return null;
    }

    public static List<Integer> howSumMemoized(int target, int[] nums) {
        Map<Integer, List<Integer>> memo = new HashMap<>();
        return howSumMemoized(target, nums, memo);
    }
    public static List<Integer> howSumMemoized(int target, int[] nums, Map<Integer, List<Integer>> memo) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target == 0) return new ArrayList<Integer>();
        if (target < 0) return null;
        for (int num : nums) {
            int remainder = target - num;
            List<Integer> result = howSumMemoized(remainder, nums, memo);
            if (result != null) {
                result.add(num);
                memo.put(target, result);
                return result;
            }
        }
        memo.put(target, null);
        return null;
    }
}
