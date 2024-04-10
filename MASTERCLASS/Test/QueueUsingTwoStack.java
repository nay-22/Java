package MASTERCLASS.Test;

import java.util.Deque;
import java.util.Stack;

public class QueueUsingTwoStack {
    public static void main(String[] args) {

        QueueStack<Integer> queue = new QueueStack<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
    }

}

class QueueStack<T> {
    private final Stack<T> stack1;
    private final Stack<T> stack2;

    public QueueStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public void offer(T data) {
        stack1.push(data);
    }

    public T poll() {
        if (stack1.isEmpty()) return null;
        while (!stack1.isEmpty()) stack2.push(stack1.pop());
        T item = stack2.pop();
        while (!stack2.isEmpty()) stack1.push(stack2.pop());
        return item;
    }

    public T peek() {
        if (stack1.isEmpty()) return null;
        while (!stack1.isEmpty()) stack2.push(stack1.pop());
        T item = stack2.peek();
        while (!stack2.isEmpty()) stack1.push(stack2.pop());
        return item;
    }

    @Override
    public String toString() {
        return stack1.toString();
    }
}
