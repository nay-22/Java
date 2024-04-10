package DSA.DATA_STRUCTURES.REVISE;
import java.util.Stack;

public class StackQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public StackQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void offer(int data) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(data);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int poll() {
        if (stack1.isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }
        return stack1.pop();
    }

    public void display() {
        if (stack1.isEmpty()) {
            System.out.println("Queue Empty");
        } else {
            Stack<Integer> temp = new Stack<>();
            while (!stack1.isEmpty()) {
                temp.push(stack1.pop());
            }
            System.out.println(temp);
            while (!temp.isEmpty()) {
                stack1.push(temp.pop());
            }
        }
    }

    public static void main(String[] args) {
        StackQueue queue = new StackQueue();

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
