package DSA.DP.NeetCode1D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HouseRobber {
    public static void main(String[] args) {
//        List<Integer> houses = new ArrayList<>(Arrays.asList(1, 2, 3, 1));
        List<Integer> houses = new ArrayList<>(Arrays.asList(5, 3, 2));
        System.out.println("House Robber 1 = " + rob(houses));
        System.out.println("House Robber 2 = " + robber2(houses));
    }

    private static int rob(List<Integer> houses) {
        int rob1 = 0;
        int rob2 = 0;
        // [rob1, rob2, n, n+1, n+2,...]
        // if we want to rob n, we also want to rob 1, if we want to rob 2, we can't include n
        for (int house : houses) {
            int temp = Math.max(house + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }

    private static int robber2(List<Integer> houses) {
        List<Integer> sub1 = new ArrayList<>(houses);
        List<Integer> sub2 = new ArrayList<>(houses);
        sub1.remove(sub1.size() - 1);
        sub2.remove(0);
        return Math.max(rob(sub1), rob(sub2));
    }
}
