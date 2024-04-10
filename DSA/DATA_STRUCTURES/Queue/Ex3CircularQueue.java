package DSA.DATA_STRUCTURES.Queue;

public class Ex3CircularQueue {
    private final int capacity = 7;
    private int[] arr = new int[capacity];
    private int front = -1;
    private int rear = -1;

    public int getFront() {
        return front;
    }
    public int getRear() {
        return rear;
    }
    public boolean isFull() {
        return (front==0 && rear==capacity-1) || (rear==front-1);
    }
    public boolean isEmpty() {
        return front==-1;
    }
    public void offer(int element) {
        if (isFull()) {
            System.out.println("Queue Full.");
        } else {
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % capacity;
            arr[rear] = element;
//            System.out.println("Rear = " + rear + ", Element = " + arr[rear]);
        }
    }
    public int poll() {
        if(isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }
        if(front==capacity-1) {
            front = 0;
            return arr[capacity-1];
        }
        front = (front+1)%capacity;
        return arr[front];
    }
    public void printQueue() {
        if(isEmpty()) {
            System.out.println("Empty Queue.");
            return;
        }
        for(int i=front; i!=rear; i=(i+1)%capacity) {
            System.out.print(arr[i]+" ");
        }
        System.out.print(arr[rear]);
        System.out.println();
    }

    public static void main(String[] args) {
        Ex3CircularQueue queue = new Ex3CircularQueue();

        queue.printQueue();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);


        queue.printQueue();

        queue.poll();
        queue.poll();
        queue.poll();

        queue.printQueue();

        queue.offer(8);
        queue.offer(9);
        queue.offer(10);

        queue.printQueue();

        queue.offer(11);
    }
}
