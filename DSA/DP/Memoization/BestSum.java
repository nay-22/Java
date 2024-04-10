package DSA.DP.Memoization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestSum {
    public static void main(String[] args) {
//        System.out.println(bestSum(7, new int []{5, 3, 4, 7}));
//        System.out.println(bestSum(8, new int[]{2, 3, 5}));
//        System.out.println(bestSum(8, new int[]{1, 4, 5}));
//        System.out.println(bestSum(100, new int[]{1, 2, 5, 25}));

        System.out.println(bestSumMemoized(7, new int []{5, 3, 4, 7}));
        System.out.println(bestSumMemoized(8, new int[]{2, 3, 5}));
        System.out.println(bestSumMemoized(8, new int[]{1, 4, 5}));
        System.out.println(bestSumMemoized(100, new int[]{1, 2, 5, 25}));
    }

    public static List<Integer> bestSum(int t, int[] nums) {
        if (t == 0) return new ArrayList<Integer>();
        if (t < 0) return null;
        List<Integer> shortestCombo = null;
        for (int num : nums) {
            int remainder = t - num;
            List<Integer> remainderCombos = bestSum(remainder, nums);
            if (remainderCombos != null) {
                remainderCombos.add(num);
                if (shortestCombo == null || remainderCombos.size() < shortestCombo.size())
                    shortestCombo = remainderCombos;
            }
        }
        return shortestCombo;
    }

    public static List<Integer> bestSumMemoized(int t, int[] nums) {
        Map<Integer, List<Integer>> memo = new HashMap<>();
        return bestSumMemoized(t, nums, memo);
    }
    public static List<Integer> bestSumMemoized(int t, int[] nums, Map<Integer, List<Integer>> memo) {
        if (memo.containsKey(t)) return memo.get(t);
        if (t == 0) return new ArrayList<Integer>();
        if (t < 0) return null;
        List<Integer> shortestCombo = null;
        for (int num : nums) {
            int remainder = t - num;
            List<Integer> remainderCombos = bestSumMemoized(remainder, nums, memo);
            if (remainderCombos != null) {
                List<Integer> combos = new ArrayList<>(remainderCombos);
                combos.add(num);
                if (shortestCombo == null || combos.size() < shortestCombo.size())
                    shortestCombo = combos;
            }
        }
        memo.put(t, shortestCombo);
        return shortestCombo;
    }
}
