package DSA.DATA_STRUCTURES.Stack;

public class TwoStackMain {
    public static void main(String[] args) {
        TwoStack stack = new TwoStack(20);
        stack.pushOne(4);
        stack.pushOne(5);
        stack.pushOne(9);
        stack.pushOne(1);
        stack.pushOne(3);
        stack.pushOne(4);
        stack.pushOne(5);
        stack.pushOne(9);
        stack.pushOne(1);
        stack.pushOne(3);
        stack.pushOne(3);
        stack.pushOne(3);
        stack.printStackOne();

        stack.popOne();
        stack.popOne();
        stack.popOne();
        stack.popOne();
        stack.popOne();
        stack.popOne();
        stack.printStackOne();

        System.out.println();

        stack.pushTwo(17);
        stack.pushTwo(12);
        stack.pushTwo(15);
        stack.pushTwo(19);
        stack.pushTwo(18);
        stack.pushTwo(11);
        stack.pushTwo(14);
        stack.printStackTwo();

        stack.popTwo();
        stack.popTwo();
        stack.popTwo();
        stack.popTwo();
        stack.popTwo();
        stack.popTwo();
        stack.popTwo();
        stack.popTwo();
        stack.printStackTwo();

    }

}

class TwoStack {
    private int arr[];
    private int top1, top2;
    private int size;

    public TwoStack(int size) {
        arr = new int[size];
        this.size = size;
        top1 = -1;
        top2 = size/2-1;
    }

    public int size() {
        return size/2;
    }

    public boolean isFullOne() {
        return top1 == size/2-1;
    }

    public boolean isFullTwo() {
        return top2 == size-1;
    }

    public boolean isEmptyOne() {
        return top1 == -1;
    }

    public boolean isEmptyTwo() {
        return top2 == size/2-1;
    }

    public void pushOne(int val) {
        if (isFullOne()) {
            System.out.println("Stack 1 Overflow");
        } else {
            arr[++top1] = val;
        }
    }

    public void pushTwo(int val) {
        if (isFullTwo()) {
            System.out.println("Stack 2 Overflow");
        } else {
            arr[++top2] = val;
        }
    }

    public int popOne() {
        if (isEmptyOne()) {
            return -1;
        } return arr[top1--];
    }

    public int popTwo() {
        if (isEmptyTwo()) {
            return -1;
        } return arr[top2--];
    }

    public int peekOne() {
        return arr[top1];
    }

    public int peekTwo() {
        return arr[top2];
    }

    public void printStackOne() {
        if (!isEmptyOne()) {
            System.out.println("STACK 1");
            System.out.println(arr[top1] + "<--Head");
            for(int i = top1-1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("Stack 1 Empty");
        }
    }

    public void printStackTwo() {
        if (!isEmptyOne()) {
            System.out.println("STACK 2");
            System.out.println(arr[top2] + "<--Head");
            for(int i = top2-1; i >= size/2; i--) {
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("Stack 2 Empty");
        }
    }


}
