package DSA.DATA_STRUCTURES.REVISE_V2.STACK;

import java.util.Stack;

public class SortStack {
    private static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {
        stack.push(3);
        stack.push(1);
        stack.push(5);
        stack.push(2);
        stack.push(4);
        System.out.println("Unsorted" + stack);
        stack = sortStack();
        System.out.println("Sorted" + stack);
    }
    private static Stack<Integer> sortStack() {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            int top = stack.pop();
            while (!temp.isEmpty() && temp.peek() < top) {
                stack.push(temp.pop());
            }
            temp.push(top);
        }
        return temp;
    }
}
