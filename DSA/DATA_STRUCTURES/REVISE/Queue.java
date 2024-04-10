package DSA.DATA_STRUCTURES.REVISE;

public class Queue {
    private int capacity;
    private int[] arr;
    private int rear;
    private int front;
    public Queue(int capacity) {
        this.capacity = capacity;
        front = -1;
        rear = -1;
        arr = new int[capacity];
    }
    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }
    public boolean isFull() {
        return rear == arr.length - 1;
    }
    public void offer(int val) {
        if (isFull()) {
            System.out.println("Queue Full");
        } else {
            if (front == -1)
                front = 0;
            arr[++rear] = val;
        }
    }
    public int poll() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        } else {
            int val = arr[front];
            if (front >= rear) { // Reset queue if only one item present at last index
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            return val;
        }
    }
    public void display() {
        if (!isEmpty()) {
            for (int i = 0; i < front; i++) {
                System.out.print("  ");
            }
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = rear + 1; i < arr.length; i++) {
                System.out.print("  ");
            }
            System.out.println();
        }
        else
            System.out.println("Empty Queue");
    }

    public static void main(String[] args) {
        int size = 7;
        Queue queue = new Queue(size);
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
