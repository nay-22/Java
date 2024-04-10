package DSA.DATA_STRUCTURES.REVISE_V2.STACK;

import java.util.*;

public class ReverseFirstKOfQueue {

    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        queue.offer(8);
        int k = 4;
        System.out.println(queue);
        queue = reverseFirstK(queue, k);
        System.out.println(queue);
    }

    public static Deque<Integer> reverseFirstK(Deque<Integer> queue, int k) {
        Deque<Integer> stack = new ArrayDeque<>();
        while (k-- > 0) {
            stack.push(queue.poll());
        }
        while (!queue.isEmpty()) {
            stack.offer(queue.poll());
        }
        return stack;
    }

}
