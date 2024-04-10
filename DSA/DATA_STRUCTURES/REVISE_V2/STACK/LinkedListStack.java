package DSA.DATA_STRUCTURES.REVISE_V2.STACK;

public class LinkedListStack {
    public static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
        }
    }
    public Node top;
    LinkedListStack() {
        top = null;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public void push(int data) {
        if (isEmpty()) {
            top = new Node(data);
            return;
        }
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        System.out.println("Inserted " + top.data);
    }
    public int peek() {
        if (!isEmpty())
            return top.data;
        return -1;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int data = top.data;
        top = top.next;
        System.out.println("Deleted " + data);
        return data;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[Empty Stack]";
        }
        StringBuilder str = new StringBuilder("");
        str.append("[");
        Node temp = top;
        while (temp != null) {
            if (temp.next != null) {
                str.append(temp.data).append(",").append(" ");
            } else {
                str.append(temp.data);
            }
            temp = temp.next;
        }
        str.append("]");
        return str.toString();
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        System.out.println(stack);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}

