package DSA.DATA_STRUCTURES.REVISE_V2.STACK;

import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String exp = "2 3 1 * + 9 - ";
        System.out.println(evaluate(exp));
    }
    private static int evaluate(String exp) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (c ==' ') continue;
            if (Character.isDigit(c)) {
                int n = 0;
                while (Character.isDigit(c)) {
                    n = n * 10 + (int)(c - '0');
                    i++;
                    c = exp.charAt(i);
                }
                i--;
                stack.push(n);
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (c) {
                    case '*' -> stack.push(a * b);
                    case '/' -> stack.push(a / b);
                    case '+' -> stack.push(a + b);
                    case '-' -> stack.push(a - b);
                    case '^' -> stack.push((int) Math.pow(a, b));
                }
            }
        }
        return stack.pop();
    }
}
