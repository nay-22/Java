package DSA.DATA_STRUCTURES.REVISE_V2.STACK;


import edu.princeton.cs.algs4.In;

import java.util.Stack;

public class ReverseStack {
    private static final Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        reverseStack();
        System.out.println(stack);
    }
    public static void reverseStack () {
        if (stack.size() > 0) {
            int top = stack.pop();
            reverseStack();
            push_bottom(top);
        }
    }
    public static void push_bottom(int ele) {
        if (stack.isEmpty()) {
            stack.push(ele);
        } else {
            int top = stack.pop();
            push_bottom(ele);
            stack.push(top);
        }
    }
}
