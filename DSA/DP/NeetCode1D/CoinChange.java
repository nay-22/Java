package DSA.DP.NeetCode1D;

public class CoinChange {
    public static void main(String[] args) {
        int n = 4;
        int[] coins = {1,3,5,10};
        System.out.println("No. of ways for coin change = " + coinChange(n));
        System.out.println("No. of ways for coin change with denomination = " + coinChangeWithDenominations(n, coins));
    }
    private static int coinChange(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i >= 1) dp[i] += dp[i-1];
            if (i >= 3) dp[i] += dp[i-3];
            if (i >= 5) dp[i] += dp[i-5];
            if (i >= 10) dp[i] += dp[i-10];
        }
        return dp[n];
    }
    private static int coinChangeWithDenominations(int n, int[] coins) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) dp[i] += dp[i-coin];
            }
        }
        return dp[n];
    }
}
