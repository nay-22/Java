package DSA.DP.NeetCode1D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        List<Integer> cost = new ArrayList<>(Arrays.asList(10, 15, 20));
        int[] c = {0, 3, 2, 4, 6, 1, 1, 5, 3};
//        System.out.println("Min cost of climbing stairs = " + minCost(cost));
        System.out.println("Min cost of climbing stairs = " + minCost(c));
    }
    private static int minCost(List<Integer> cost) {
        cost.add(0);
        for (int i = cost.size() - 3; i >= 0; i--) {
            cost.set(i, cost.get(i) + Math.min(cost.get(i+1), cost.get(i+2)));
        }
        return Math.min(cost.get(0), cost.get(1));
    }

    private static int minCost(int[] cost) {
        int n = cost.length - 1;
        int[] dp = new int[n + 1];
        int[] from = new int[n + 1];
        List<Integer> path = new ArrayList<>();
        dp[0] = 0;
        dp[1] = cost[1];
        for (int i = 2; i <= n; i++) {
            int min = Math.min(dp[i - 1], dp[i - 2]);
            dp[i] = min + cost[i];
            if (dp[i-1] < dp[i-2]) {
                from[i] = i - 1;
            } else {
                from[i] = i - 2;
            }
        }
        for (int i = n; i >= 0; i--) {
            path.add(from[i]);
        }
        System.out.println(path);
        return dp[n];
    }
}
