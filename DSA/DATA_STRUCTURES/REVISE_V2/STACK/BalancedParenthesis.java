package DSA.DATA_STRUCTURES.REVISE_V2.STACK;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String exp = "[()]{}{[()()]()}";
        System.out.println("Balanced Parenthesis : " + isBalanced(exp));
    }

    public static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty())
                return false;
            switch (c) {
                case ']':
                    if (stack.pop() != '[')
                        return false;
                    break;
                case ')':
                    if (stack.pop() != '(')
                        return false;
                    break;
                case '}':
                    if (stack.pop() != '{')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
