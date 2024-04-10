package DSA.DATA_STRUCTURES.REVISE;

public class CircularQueue {
    int capacity;
    int front;
    int rear;
    int[] arr;
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        front = -1;
        rear = -1;
        arr = new int[capacity];
    }
    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }
    public boolean isEmpty() {
        return front == -1;
    }
    public void offer(int val) {
        if (isFull()) {
            System.out.println("Queue Full");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % capacity;
            arr[rear] = val;
        }
    }
    public int poll() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        } else {
            int val = arr[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % capacity;
            }
            return val;
        }
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
        }
        else {
            for (int i = front; i != rear; i = (i+1) % capacity) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 7;
        CircularQueue queue = new CircularQueue(size);
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
