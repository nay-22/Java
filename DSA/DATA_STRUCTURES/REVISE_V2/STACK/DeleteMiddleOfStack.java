package DSA.DATA_STRUCTURES.REVISE_V2.STACK;

import java.util.Stack;

public class DeleteMiddleOfStack {
    private static final Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {
        Stack<Integer> temp = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        int s = stack.size();
        System.out.println(stack);
        for (int i = 0; i <= s/2; i++) {
            temp.push(stack.pop());
        }
        temp.pop();
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        System.out.println(stack);
    }
}
