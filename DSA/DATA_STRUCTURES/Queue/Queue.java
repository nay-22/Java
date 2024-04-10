package DSA.DATA_STRUCTURES.Queue;

import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> queue = new LinkedList<T>();

    public int getSize() {
        return queue.size();
    }

    public boolean isEmpty() {
        return getSize()==0;
    }

    public T peek() {
        if(isEmpty()) throw new RuntimeException("Queue Empty");
        return queue.peekFirst();
    }

    public void enQueue(T data) {
        queue.addFirst(data);
    }

    public T deQueue() {
        T first = queue.getLast();
        queue.removeLast();
        return first;
    }

    public void printQueue() {
        System.out.print("Head -> ");
        for(int i=queue.size()-1; i>=0; i--) {
            System.out.print(queue.get(i)+" ");
        }
        System.out.println();
    }
}
