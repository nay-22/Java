package COLLECTION_FRAMEWORK.QueueInterface;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(1);
        dq.offer(2);
        dq.offer(3);
        dq.offer(4);
        dq.offerFirst(5);
        dq.offerLast(6);
        System.out.println(dq);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        dq.pollFirst();
        System.out.println(dq);
        dq.pollLast();
        System.out.println(dq);
    }
}
