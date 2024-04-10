package DSA.DP.NeetCode1D;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
//        System.out.println("Number of ways to climb " + " stairs = " + findWays(n));
        System.out.println("Number of ways to climb " + " stairs = " + distinctWays(n));
        System.out.println("Number of ways to climb " + " stairs (optimized) = " + distinctWaysOptimized(n));
    }
    private static int findWays(int n) {
//        int[] dp = new int[n+1];
//        dp[n] = 1;
//        dp[n-1] = 1;  // No need for entire array, can be done with only two variables
        int one = 1;
        int two = 1;
        for (int i = 0; i < n-1; i++) {
            int temp = one;
            one = one + two;
            two = temp;
        }
        return one;
    }

    private static int distinctWays(int n) {
        // order of execution bottom-up
        int[] dp = new int[n+1];
        dp[0] = 1; // base cases
        dp[1] = 1; // base cases
//        dp[2] = 2; // base cases
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    private static int distinctWaysOptimized(int n) {
        int v1 = 1;
        int v2 = 1;
        for (int i = 2; i <= n; i++) {
            int temp = v1 + v2;
            v1 = v2;
            v2 = temp;
        }
        return v2;
    }

}
