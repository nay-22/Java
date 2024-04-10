package DSA.DATA_STRUCTURES.Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStackRecursive {

    private static final Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            stack.push(in.nextInt());
        }
        System.out.println("Original Stack Order\n" + stack);
        reverseStack();
        System.out.println("Reversed Stack Order\n" + stack);
        System.out.println(stack.peek());
    }

    public static void reverseStack() {
        if (stack.size() > 0) {
            int x = stack.peek();
            stack.pop();
            reverseStack();
            insertAtBottom(x);
        }
    }

    public static void insertAtBottom(int top) {
        if (stack.isEmpty()) {
            stack.push(top);
        }
        else {
            int top_val = stack.peek();
            stack.pop();
            insertAtBottom(top);
            stack.push(top_val);
        }
    }
}
