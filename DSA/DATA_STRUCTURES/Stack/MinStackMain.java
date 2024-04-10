package DSA.DATA_STRUCTURES.Stack;

public class MinStackMain {
    public static void main(String[] args) {
        
    }
}

class MinStack {
    private final int[] data;
    private int top;
    private final int capacity;
    int min = Integer.MAX_VALUE;

    public MinStack(int capacity) {
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
            min = Math.min(min, val);
            data[++top] = val;
        }
    }

    public int getMin() {
        return min;
    }

    public void pushBottom(int val) {
        if (isFull()) {
            System.out.println("Overflow");
        } else {
            MinStack temp = new MinStack(capacity);
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
        if (peek() == min) {

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
