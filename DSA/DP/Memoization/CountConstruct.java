package DSA.DP.Memoization;

import java.util.HashMap;
import java.util.Map;

public class CountConstruct {
    public static void main(String[] args) {
//        System.out.println(countConstruct("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd"}));
//        System.out.println(countConstruct("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
//        System.out.println(countConstruct("enterapotentpot", new String[] {"a", "p", "ent", "enter", "ot", "e", "t"}));
//        System.out.println(countConstruct("e".repeat(39)+"f", new String[] {"e", "ee", "eee", "eeee", "eeeee", "eeeeee"}));

        System.out.println(countConstructMemoized("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd"}));
        System.out.println(countConstructMemoized("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
        System.out.println(countConstructMemoized("enterapotentpot", new String[] {"a", "p", "ent", "enter", "ot", "e", "t"}));
        System.out.println(countConstructMemoized("e".repeat(39)+"f", new String[] {"e", "ee", "eee", "eeee", "eeeee", "eeeeee"}));

    }

    public static int countConstruct(String t, String[] wordBank) {
        if (t.equals("")) return 1;
        int totalCount = 0;
        for (String word : wordBank) {
            if (t.indexOf(word) == 0) {
                String suffix = t.substring(word.length());
                int ways =  countConstruct(suffix, wordBank);
                totalCount += ways;
            }
        }
        return totalCount;
    }

    public static int countConstructMemoized(String t, String[] wordBank) {
        Map<String, Integer> memo = new HashMap<>();
        return countConstructMemoized(t, wordBank, memo);
    }

    private static int countConstructMemoized(String t, String[] wordBank, Map<String, Integer> memo) {
        if (memo.containsKey(t)) return memo.get(t);
        if (t.equals("")) return 1;
        int totalCount = 0;
        for (String word : wordBank) {
            if (t.indexOf(word) == 0) {
                String suffix = t.substring(word.length());
                int ways =  countConstructMemoized(suffix, wordBank, memo);
                totalCount += ways;
                memo.put(suffix, ways);
            }
        }
        return totalCount;
    }
}
