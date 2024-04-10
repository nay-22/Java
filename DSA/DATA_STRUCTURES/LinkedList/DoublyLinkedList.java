package DSA.DATA_STRUCTURES.LinkedList;

public class DoublyLinkedList <T> {
    private int size = 0;
    public Node<T> head = null;
    public Node<T> tail = null;

    private static class Node <T>{
        T data;
        Node<T> prev, next;
        public Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public void clearList() {
        Node<T> ptr = head;
        while(ptr!=null) {
            Node<T> next = ptr.next;
            ptr.prev = ptr.next = null;
            ptr.data = null;
            ptr = next;
        }
        head = tail = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize()==0;
    }

    public void addFirst(T data) {
        if(isEmpty()) {
            head = tail = new Node<T>(data,null,null);
        } else {
            head.prev = new Node<T>(data,null, head); //Both prev, next links initialized
            head = head.prev;
        }
        size++;
    }

    public void addLast(T data) {
        if(isEmpty()) {
            head = tail = new Node<T>(data, null, null);
        } else {
            tail.next = new Node<T>(data,tail,null);
            tail = tail.next;
        }
        size++;
    }

    public T peekFirst() {
        if(isEmpty()) throw new RuntimeException("Empty List, Invalid Operation.");
        else return head.data;
    }

    public T peekLast() {
        if(isEmpty()) throw new RuntimeException("Empty List, Invalid Operation.");
        else return tail.data;
    }

    public void removeFirst() {
        if(isEmpty()) throw new RuntimeException("Empty List, Invalid Operation.");

        T data = head.data;
        head = head.next;
        --size;

        if(isEmpty()) tail = null;
        else head.prev = null;

    }

    public void removeLast() {
        if(isEmpty()) throw new RuntimeException("Empty List, Invalid Operation.");

        T data = tail.data;
        tail = tail.prev;
        --size;

        if(isEmpty()) head = null;
        else tail.next = null;
    }

    public T remove(Node<T> node) {
        if(node.prev==null) removeFirst();
        if(node.next==null) removeLast();

        node.prev.next = node.next;
        node.next.prev = node.prev;

        T data = node.data;
        node.data = null;
//        node = node.prev = node.next = null; //null assignment never used warning
        return data;
    }

    public void remove(T data) {
        Node<T> trav = head;
        boolean found = false;
        while(trav!=null) {
            if(trav.data==data) {
                remove(trav);
//                trav.prev.next = trav.next;
//                trav.next.prev = trav.prev;
                found = true;
                break;
            }
            trav = trav.next;
        }
        System.out.println(data+"was removed from the list.");
    }

    public void printList() {
        Node<T> trav = head;
        if(trav==null) {
            System.out.println("List is Empty.");
        } else {
            while(trav!=null) {
                System.out.print(trav.data+"->");
                trav = trav.next;
            }
            System.out.println("null");
        }
    }





}
