package DSA.DP.Tabulation;

import java.util.Arrays;

public class CanSum {
    public static void main(String[] args) {
        System.out.println(canSum(7, new int[]{2,3}));
        System.out.println(canSum(7, new int[]{5,4,3,7}));
        System.out.println(canSum(7, new int[]{2,4}));
        System.out.println(canSum(8, new int[]{2,3,5}));
        System.out.println(canSum(300, new int[]{7, 14}));
    }

    public static boolean canSum(int t, int[] nums) {
        boolean[] dp = new boolean[t+1];
        dp[0] = true;
        for (int i = 0; i <= t; i++) {
            if (dp[i]) {
                for (int num : nums) {
                    if ((i + num) <= t)
                        dp[i+num] = true;
                }
            }
        }
        return dp[t];
    }
}
