package DSA.DATA_STRUCTURES.Stack;

import java.util.Stack;

public class BalancedParantheses {
    public static void main(String[] args) {
        String expr = "([{}])";
        System.out.println(checkParentheses(expr));
    }
    public static boolean checkParentheses (String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char check;
            switch (c) {
                case ')' -> {
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                }
                case '}' -> {
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                }
                case ']' -> {
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
