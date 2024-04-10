package DSA.DP.NeetCode1D;

import java.util.Arrays;

public class UniquePaths {
    public static void main(String[] args) {
        int m = 3;
        int n = 4;
        int[][] grid = {{1,3,1,1,2},
                        {2,1,1,1,1},
                        {5,4,4,2,1}};
        
        System.out.println("No. of ways = " + uniquePaths(m, n));
        System.out.println("Max Profit = " + maxPath(grid));
    }
    // F(i,j) = F(i-1,j) + F(i,j-1)
    private static int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        dp[1][0] = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m][n];
    }

    private static int maxPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = grid;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0 && j > 0)
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + grid[i][j];
                else if (i > 0)
                    dp[i][j] = dp[i-1][j] + grid[i][j];
                else if (j > 0)
                    dp[i][j] = dp[i][j-1] + grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }


}
