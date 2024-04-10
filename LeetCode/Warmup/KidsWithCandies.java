package LeetCode.Warmup;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        boolean isNotTheGreatest = false;
        int count = 0;
        for (int candy : candies) {
            candy += extraCandies;
            for (int j : candies) {
                if (candy >= j) {
                    count++;
                }
            }
            if (count == candies.length) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

}