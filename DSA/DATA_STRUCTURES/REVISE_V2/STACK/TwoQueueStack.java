package DSA.DATA_STRUCTURES.REVISE_V2.STACK;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class TwoQueueStack {
    private Queue<Integer> q1 = new ArrayDeque<>();
    private Queue<Integer> q2 = new ArrayDeque<>();

    public void push(int ele) {
        q1.offer(ele);
        System.out.println("Inserted " + ele);
    }

    public int pop() {
        if (q1.isEmpty())
            return -1;
        int top = 0;
        while (!q1.isEmpty()) {
            if (q1.size() == 1) {
                top = q1.poll();
                System.out.println("Deleted " + top);
                break;
            }
            q2.offer(q1.poll());
        }
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
        return top;
    }

    public int peek() {
        if (q1.isEmpty())
            return -1;
        int top = 0;
        while (!q1.isEmpty()) {
            if (q1.size() == 1) {
                top = q1.peek();
            }
            q2.offer(q1.poll());
        }
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
        return top;
    }

    @Override
    public String toString() {
        if (q1.isEmpty())
            return "[Empty Stack]";
        int[] temp = new int[q1.size()];
        int i = temp.length - 1;
        for (Integer integer : q1) {
            temp[i--] = integer;
        }
        return Arrays.toString(temp);
    }

    public static void main(String[] args) {
        TwoQueueStack stack = new TwoQueueStack();
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
