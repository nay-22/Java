package DSA.DP.NeetCode1D;

public class ClimbingStairs3Steps {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        System.out.println("Ways to climb stairs (3 steps) = " + distinctWays(n));
        System.out.println("Ways to climb stairs (k steps) = " + distinctWays(n,k));
        System.out.println("Ways to climb stairs (k steps) = " + distinctWaysOptimized(n,k));
        System.out.println("Ways to climb stairs (k steps) = " + distinctWaysOptimized(n,k, new boolean[]{true, false, true, true, false, false, false}));
    }
    private static int distinctWays(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1; // Base Cases
        dp[1] = 1; // Base Cases
        dp[2] = 2; // Base Cases
//        dp[3] = 4; // Base Cases
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }

    private static int distinctWays(int n, int k) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (i - j < 0) continue;
                dp[i] += dp[i-j];
            }
        }
        return dp[n];
    }

    private static int distinctWaysOptimized(int n, int k) {
        int[] dp = new int[k];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < k; j++) {
                if (i - j < 0) continue;
                dp[i % k] += dp[(i-j) % k];
            }
        }
        return dp[n % k];
    }

    private static int distinctWaysOptimized(int n, int k, boolean[] stairs) {
        int[] dp = new int[k];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < k; j++) {
                if (i - j < 0) continue;
                if (stairs[i - 1]) dp[i % k] = 0; // if stair to be skipped, make its value 0
                else dp[i % k] += dp[(i-j) % k];
            }
        }
        return dp[n % k];
    }


}
