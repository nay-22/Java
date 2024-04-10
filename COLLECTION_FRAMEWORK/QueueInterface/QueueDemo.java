package COLLECTION_FRAMEWORK.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.add(55);

        System.out.println(queue);

        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek());

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue.peek());
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        queue.remove();
        System.out.println(queue.element());
        System.out.println(queue);

    }


}
