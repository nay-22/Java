package DSA.DP.Tabulation;

import java.util.ArrayList;
import java.util.Arrays;

public class FibTabulation {
    public static void main(String[] args) {
//        System.out.println(fib(6));
//        System.out.println(fib(7));
//        System.out.println(fib(8));
//        System.out.println(fib(50));
        System.out.println(fib(6));
    }
    public static long fib(long n) {
        if (n <= 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static int fib(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        int fibSum = 0;
        for (int i = 0; i < n; i++) {
            if (i == n-1) dp[n] += dp[i];
            else {
                dp[i+1] += dp[i];
                dp[i+2] += dp[i];
            }
        }
        return dp[n];
    }

}
