package DSA.DATA_STRUCTURES.REVISE_V2.STACK;

public class ReverseStackWithoutExtraSpace {
    private static LinkedListStack stack = new LinkedListStack();

    public static void main(String[] args) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        reverseStack();
        System.out.println(stack);
    }
    public static void reverseStack() {
        stack.top = reverseStack(stack.top);
    }
    private static LinkedListStack.Node reverseStack(LinkedListStack.Node top) {
        if (top == null || top.next == null) {
            return top;
        }
        LinkedListStack.Node newNode = reverseStack(top.next);
        top.next.next = top;
        top.next = null;
        return newNode;
    }
}
