package DSA.DATA_STRUCTURES.Queue;

import java.util.Scanner;

public class ArrayQueue {
    private static final int MAX = 7;
    private int front = -1;
    private int rear = -1;
    private int[] arr = new int[MAX];
    private static final Scanner in = new Scanner(System.in);

    public void enQueue(int element) {
        if(front==-1) {
            front = rear = 0;
            arr[rear] = element;
        } else if(rear==MAX-1) {
            System.out.println("Queue Full");
        } else {
            arr[++rear] = element;
//            rear++;
        }
    }
    public int deQueue() {
        int data = -1;
        if(front>rear || front ==-1) {
            System.out.println("Queue Empty");
            front = -1;
            rear = -1;
            return -1;
        } else {
            data = arr[front];
            front++;
        }
        return data;
    }
    public void displayQueue() {
        if(front != -1) {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        else {
            System.out.println("Queue Empty");
        }
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        System.out.println("-".repeat(20)+"Queue"+"-".repeat(20));
        printInstructions();
        System.out.print("Enter you choice: ");
        int choice = in.nextInt();
        while(choice<=5) {
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter data: ");
                    queue.enQueue(in.nextInt());
                }
                case 2 -> System.out.println(queue.deQueue() + " Element Dequeued");
                case 3 -> queue.displayQueue();
                case 4 -> printInstructions();
                default -> System.out.println("Invalid Operation, Try Again.");
            }
            System.out.print("Enter Choice (7 to print list of operations): ");
            choice = in.nextInt();
        }

    }
    public static void printInstructions() {
        System.out.println("1. enQueue Element");
        System.out.println("2. deQueue Element");
//        System.out.println("3. Peek Queue");
//        System.out.println("4. Check if Empty");
//        System.out.println("5. Get Size");
        System.out.println("3. Print Queue");
        System.out.println("4. Print Operations");
        System.out.println("5. Exit");
    }

}
