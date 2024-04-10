package DSA.DATA_STRUCTURES.Stack;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String exp = "K+L-M*N+(O^P)*W/U/V*T+Q";
        // Function call
        System.out.println(getPostfixFunction(exp));
    }
    public static String getPostfixFunction(String exp) {
        StringBuilder postfix = new StringBuilder(new String(""));
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.peek());
                    stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.peek());
                    stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid Expression";
            }
            postfix.append(stack.peek());
            stack.pop();
        }
        return postfix.toString();
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
