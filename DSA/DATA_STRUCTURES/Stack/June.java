package DSA.DATA_STRUCTURES.Stack;

//STACK PUSH BOTTOM


public class June {
    public static void main(String[] args) {
        NewStack stack = new NewStack(20);
        stack.push(4);
        stack.push(2);
        stack.push(5);
        stack.push(9);
        stack.push(1);
        stack.push(6);
        stack.printStack();
        System.out.println("Push Bottom");
        stack.pushBottom(77);
        stack.printStack();
        System.out.println();
        System.out.println(stack.peek());
    }
}

class NewStack {
    private final int[] data;
    private int top;
    private final int capacity;

    public NewStack(int capacity) {
        this.capacity = capacity;
        data = new int[this.capacity];
        top = -1;
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity-1;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("Overflow");
        } else {
            data[++top] = val;
        }
    }

    public void pushBottom(int val) {
        if (isFull()) {
            System.out.println("Overflow");
        } else {
            NewStack temp = new NewStack(capacity);
            for(int i = size(); i >= 0; i--) {
                temp.push(pop());
            }
            push(val);
            for(int i = temp.size(); i >= 0; i--) {
                push(temp.pop());
            }
        }
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return data[top--];
    }

    public int peek() {
        return data[top];
    }

    public void printStack() {
        for(int i = size(); i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
}
