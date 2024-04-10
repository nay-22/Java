package DSA.DATA_STRUCTURES.Queue;

public class Ex2Queue {
    private final int capacity = 20;
    private int[] arr = new int[capacity];
    private int rear = -1;
    private int front = -1;
    public boolean isEmpty() {
        return front == -1;
    }
    public boolean isFull() {
        return front==0 && rear==capacity-1;
    }
    public void offer(int element) {
        if(isFull()) {
            System.out.println("Queue Full");
            return;
        }
        if(isEmpty()) {
            front = rear = 0;
            arr[rear] = element;
            return;
        }
        arr[++rear] = element;
    }
    public int poll() {
        if(isEmpty()) {
            return -1;
        }
        return arr[front++];
    }
    public int size() {
        return capacity;
    }
    public void printQueue() {
        for(int i=front; i<=rear; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Ex2Queue queue = new Ex2Queue();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        queue.printQueue();
        System.out.println();
        queue.poll();
        queue.poll();
//        queue.poll();
//        queue.poll();

        queue.printQueue();

    }
}
