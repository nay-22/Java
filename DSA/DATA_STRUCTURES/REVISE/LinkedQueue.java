package DSA.DATA_STRUCTURES.REVISE;

public class LinkedQueue {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    Node head, tail;
    public LinkedQueue() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void offer(int data) {
        if (isEmpty()) {
            tail = head = new Node(data);
            return;
        }
        tail.next = new Node(data);
        tail = tail.next;
    }

    public int poll() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }
        int data = head.data;
        if (head == tail) {
            head = tail = null;
        }
        head = head.next;
        return data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int peekFirst() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }
        return head.data;
    }

    public int peekLast() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }
        return tail.data;
    }

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.display();
        System.out.println("OFFER");
        queue.offer(3);
        queue.offer(7);
        queue.offer(2);
        queue.offer(9);
        queue.offer(5);
        queue.offer(6);
        queue.offer(1);
        queue.offer(4);
        queue.display();

        System.out.println("POLL");
        queue.poll();
        queue.display();

        queue.poll();
        queue.display();

        queue.poll();
        queue.display();

        queue.poll();
        queue.display();

        queue.poll();
        queue.display();

        queue.poll();
        queue.display();

        queue.poll();
        queue.display();

        queue.offer(9);
        queue.offer(4);
        queue.offer(1);
        queue.offer(8);
        queue.offer(7);
        queue.display();

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.display();

        queue.offer(1);
        queue.offer(8);
        queue.offer(6);
        queue.display();
    }
}
