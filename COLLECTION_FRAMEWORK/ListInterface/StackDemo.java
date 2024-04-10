package COLLECTION_FRAMEWORK.ListInterface;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        System.out.println(stack.peek());
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
