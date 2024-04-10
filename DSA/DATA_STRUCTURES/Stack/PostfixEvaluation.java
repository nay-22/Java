package DSA.DATA_STRUCTURES.Stack;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack  = new Stack<>();
        String exp = in.nextLine();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int first = stack.pop();
                int second = stack.pop();
                int ans = switch (exp.charAt(i)) {
                    case '+' -> first + second;
                    case '-' -> first - second;
                    case '/' -> first/second;
                    case '*' -> first*second;
                    case '^' -> first^second;
                    default -> -1;
                };
                stack.push(ans);
            }
        }
        System.out.println("Output: " + stack.pop() );
        in.close();
    }
}
