package DSA.DATA_STRUCTURES.Stack;
import java.util.EmptyStackException;
import java.util.LinkedList;

public class Stack<T> {
    private final LinkedList<T> stack = new LinkedList<T>();

    public int getSize() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.size()==0;
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        if(isEmpty()) throw new EmptyStackException();
        T element = stack.peekLast();
        stack.removeLast();
        return element;
    }

    public T peek() {
        if(isEmpty()) throw new EmptyStackException();
        return stack.peekFirst();
    }

    public void printStack() {
        if(isEmpty()) throw new EmptyStackException();
        else {
            System.out.println(stack.get(stack.size()-1) + " <- Head");
            for(int i=stack.size()-2; i>=0; i--) {
                System.out.println(stack.get(i));
            }
        }

    }
}
