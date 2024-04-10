package DSA.DATA_STRUCTURES.REVISE_V2.STACK;

public class ArrayStack {
    private int[] arr;
    private int top;
    private final int size;
    ArrayStack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int peek() {
        if (!isEmpty())
            return arr[top];
        return -1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        top = top + 1;
        arr[top] = element;
        System.out.println("Inserted " + element);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int ele = peek();
        top = top - 1;
        System.out.println("Deleted " + ele);
        return ele;
    }

    @Override
    public String toString() {
        if (top == -1) {
            return "[Empty Stack]";
        }
        StringBuilder temp = new StringBuilder("");
        temp.append("[");
        for (int i = top; i >= 0; i--) {
            if (i != 0)
                temp.append(arr[i]).append(", ");
            else
                temp.append(arr[i]);
        }
        temp.append("]");
        return temp.toString();
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(7);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println(stack);
        System.out.println("stack.peek() = " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);


    }
}