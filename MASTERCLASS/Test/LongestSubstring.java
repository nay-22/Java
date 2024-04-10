package MASTERCLASS.Test;

import javax.swing.*;
import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,5,1,6,5};
//        List<Integer> list = new ArrayList<>(List.);
//        Set<Integer> set = new HashSet<>().addA;
//        System.out.println(set.toString());

        String s = "dvdf";
//        String s = "abcabcb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int max = 0, left = 0, right = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            if (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(c);
                max = Math.max(max, set.size());
                right++;
            }
        }
        return max;
    }
}
