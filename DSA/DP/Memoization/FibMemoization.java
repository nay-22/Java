package DSA.DP.Memoization;

import java.util.HashMap;
import java.util.Map;

public class FibMemoization {
    public static void main(String[] args) {
        System.out.println(fib(6));
        System.out.println(fib(7));
        System.out.println(fib(8));
        System.out.println(fib(50));
    }

    public static Map<Long, Long> memo = new HashMap<>();
    public static long fib(long n) {
        if (memo.containsKey(n)) return memo.get(n);
        if (n <= 2) return 1;
        memo.put(n, fib(n - 1) + fib(n - 2));
        return memo.get(n);
    }
}
