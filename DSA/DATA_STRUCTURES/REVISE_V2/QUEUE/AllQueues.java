package DSA.DATA_STRUCTURES.REVISE_V2.QUEUE;

import java.util.Stack;

public class AllQueues {
    public static void main(String[] args) {
        LLQ q = new LLQ();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.display();
        q.poll();
        q.poll();
        q.display();
        q.offer(6);
        q.offer(7);
        q.display();
        System.out.println();
        StackQueue sq = new StackQueue();
        sq.offer(1);
        sq.offer(2);
        sq.offer(3);
        sq.offer(4);
        sq.offer(5);
        System.out.println(sq);
        sq.poll();
        sq.poll();
        System.out.println(sq);
    }
}

class LLQ {
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void offer(int data) {
        if (head == null && tail == null) {
            head = tail = new Node(data);
            return;
        }
        Node temp = new Node(data);
        tail.next = temp;
        tail = temp;
    }

    public int poll() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        int data = head.data;
        head = head.next;
        if (head == null) tail = null;
        return data;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class StackQueue {
    Stack<Integer> queue = new Stack<>();
    Stack<Integer> temp = new Stack<>();
    public void offer(int data) {
        queue.push(data);
    }
    public int poll() {
        while (queue.size() != 1) {
            temp.push(queue.pop());
        }
        int data = queue.pop();
        while (!temp.isEmpty()) {
            queue.push(temp.pop());
        }
        return data;
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
