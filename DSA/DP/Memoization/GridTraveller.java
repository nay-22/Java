package DSA.DP.Memoization;

import java.util.HashMap;
import java.util.Map;

public class GridTraveller {
    public static void main(String[] args) {
        System.out.println(gridTraveller(1,1));
        System.out.println(gridTraveller(2,3));
        System.out.println(gridTraveller(3,2));
        System.out.println(gridTraveller(3,3));
        System.out.println(gridTravellerMemoized(18,18));
    }

    public static long gridTraveller(long m, long n) {
        if (m == 1 && n == 1) return 1;
        if (m == 0 || n == 0) return 0;
        return gridTraveller(m-1, n) + gridTraveller(m, n-1);
    }

    public static Map<String, Long> memo = new HashMap<>();
    public static long gridTravellerMemoized(long m, long n) {
        String key = m + ", " + n;
        if (memo.containsKey(key)) return memo.get(key);
        if (m == 1 && n == 1) return 1;
        if (m == 0 || n == 0) return 0;
        memo.put(key, gridTravellerMemoized(m-1, n) + gridTravellerMemoized(m, n-1));
        return memo.get(key);
    }
}
