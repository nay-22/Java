package DSA.DATA_STRUCTURES.Stack;

public class Ex1Stack {
    private int capacity = 20;
    private int[] arr = new int[capacity];
    private int top = -1;
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == capacity-1;
    }
    public void push(int element) {
        if(isFull()) {
            System.out.println("Stack Overflow.");
            return;
        }
        arr[++top] = element;
    }
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack Underflow.");
            return -1;
        }
        return arr[top--];
    }
    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return arr[top];
    }
    public int size() {
        return top+1;
    }
    public void printStack() {
        for(int i = size(); i>0; i--) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Ex1Stack stack = new Ex1Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.printStack();

        System.out.println("Top = "+stack.peek());

        stack.pop();
        stack.printStack();
        System.out.println();
        stack.pop();
        stack.printStack();
    }
}
