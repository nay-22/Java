package DSA.DATA_STRUCTURES.REVISE_V2.STACK;

import java.util.ArrayDeque;
import java.util.Queue;

public class OneQueueStack {
    Queue<Integer> queue = new ArrayDeque<>();

    public void push(int ele) {
        push(ele, queue.size());
        System.out.println("Inserted " + ele);
    }

    private void push(int ele, int i) {
        queue.add(ele);
        if (i <= 0)
            return;
        i--;
        push(queue.remove(), i);
    }

    public int pop() {
        if (queue.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        System.out.println("Deleted " + peek());
        return queue.remove();
    }

    public int peek() {
        if (queue.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return queue.peek();
    }

    @Override
    public String toString() {
        return queue.toString();
    }

    public static void main(String[] args) {
        OneQueueStack stack = new OneQueueStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        System.out.println("stack.peek() = " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
}
