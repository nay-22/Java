package DSA.DP.Memoization;

import java.util.HashMap;
import java.util.Map;

public class CanConstruct {
    public static void main(String[] args) {
//        System.out.println(canConstruct("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd"}));
//        System.out.println(canConstruct("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
//        System.out.println(canConstruct("enterapotentpot", new String[] {"a", "p", "ent", "enter", "ot", "e", "t"}));
//        System.out.println(canConstruct("e".repeat(39)+"f", new String[] {"e", "ee", "eee", "eeee", "eeeee", "eeeeee"}));

        System.out.println(canConstructMemoized("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd"}));
        System.out.println(canConstructMemoized("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
        System.out.println(canConstructMemoized("enterapotentpot", new String[] {"a", "p", "ent", "enter", "ot", "e", "t"}));
        System.out.println(canConstructMemoized("e".repeat(39)+"f", new String[] {"e", "ee", "eee", "eeee", "eeeee", "eeeeee"}));
    }

    public static boolean canConstruct(String t, String[] wordBank) {
        if (t.equals("")) return true;
        for (String word : wordBank) {
            if (t.indexOf(word) == 0) {
                String suffix = t.substring(word.length(), t.length());
                if (canConstruct(suffix, wordBank)) return true;
            }
        }
        return false;
    }

    public static boolean canConstructMemoized(String t, String[] wordBank) {
        Map<String, Boolean> memo = new HashMap<>();
        return canConstructMemoized(t, wordBank, memo);
    }
    public static boolean canConstructMemoized(String t, String[] wordBank, Map<String,Boolean> memo) {
        if (memo.containsKey(t)) return memo.get(t);
        if (t.equals("")) return true;
        for (String word : wordBank) {
            if (t.indexOf(word) == 0) {
                String suffix = t.substring(word.length(), t.length());
                if (canConstructMemoized(suffix, wordBank, memo)) {
                    memo.put(suffix, true);
                    return true;
                }
            }
        }
        memo.put(t, false);
        return false;
    }
}
