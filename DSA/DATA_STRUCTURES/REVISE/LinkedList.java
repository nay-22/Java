package DSA.DATA_STRUCTURES.REVISE;

public class LinkedList{
    static class Node {
        int data;
        Node next, prev;
        Node(int data) {
            this.data = data;
            next = prev = null;
        }
    }
    Node head, tail;
    public LinkedList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void addFirst(int data) {
        if (isEmpty()) {
            head = tail = new Node(data);
            return;
        }
        Node temp = new Node(data);
        temp.next = head;
        head.prev = temp;
        head = temp;
    }

    public void addLast(int data) {
        if (isEmpty()) {
            addFirst(data);
            return;
        }
        Node temp = new Node(data);
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
    }

    public void addBetween(int data, int a, int b) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == a && temp.next.data == b) {
                Node A = temp;
                Node B = temp.next;
                Node ptr = new Node(data);
                A.next = ptr;
                ptr.prev = A;
                ptr.next = B;
                B.prev = ptr;
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Nodes not found");
        }
    }

    public int removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List Empty");
            return -1;
        }
        int data = tail.data;
        Node temp = tail.prev;
        tail.prev = null;
        temp.next = null;
        tail = temp;
        return data;
    }

    public int removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List Empty");
            return -1;
        }
        int data = head.data;
        Node temp = head.next;
        head.next = null;
        temp.prev = null;
        head = temp;
        return data;
    }

    public boolean remove(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int peekFirst() {
        if (isEmpty()) {
            System.out.println("Linked List Empty");
            return -1;
        }
        return head.data;
    }

    public int peekLast() {
        if (isEmpty()) {
            System.out.println("Linked List Empty");
            return -1;
        }
        return tail.data;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int findNthFromLast(int n) {
        Node temp = tail;
        int i = 1;
        while (temp != null) {
            if (i == n) {
                return temp.data;
            }
            i++;
            temp = temp.prev;
        }
        return -1;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.display();

        System.out.println("Nth node from last: " + list.findNthFromLast(2));

        list.addBetween(6, 1, 4);
        list.addBetween(6, 3, 4);
        list.display();

        list.addLast(4);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        list.display();

        System.out.println("Remove First = " + list.removeFirst());
//        list.display();

        System.out.println("Remove Last = " + list.removeLast());
//        list.display();

        System.out.println(list.peekLast());
        System.out.println(list.peekFirst());

        System.out.println(list.remove(5));
        System.out.println(list.remove(55));
        list.display();


    }
}
