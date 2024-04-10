package DSA.DATA_STRUCTURES.REVISE_V2.STACK;

import java.util.Stack;

public class InfixToPostFix {
    public static void main(String[] args) {
        String exp = "((A+B)-C*(D/E))+F";
        // ((A+B)-C*(D/E))+F
        System.out.println("Infix : " + exp);
        System.out.println("PostFix: " + infixToPostfix(exp));
    }
    private static String infixToPostfix(String exp) {
        StringBuilder str = new StringBuilder("");
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c))
                str.append(c);
            else if (c == '(')
                stack.push(c);
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    str.append(stack.peek());
                    stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    str.append(stack.peek());
                    stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid Expression";
            }
            str.append(stack.peek());
            stack.pop();
        }
        return str.toString();
    }

    private static int precedence(char c) {
        return switch (c) {
            case '^' -> 3;
            case '/', '*' -> 2;
            case '+', '-' -> 1;
            default -> -1;
        };
    }
}
