package DSA.DATA_STRUCTURES.LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class Ex4LinkedList {
    Node head;
    public Ex4LinkedList() {
        head = null;
    }
    public void insertAtBeginning(int data) {
        if(head==null) {
            head = new Node(data,null);
        } else {
            Node node = new Node(data,head);
            node.next = head;
            head = node;
        }
    }
    public void insertAtEnd(int data) {
        if(head==null) {
            insertAtBeginning(data);
            return;
        }
        Node ptr = head;
        while(ptr.next!=null) {
            ptr = ptr.next;
        }
//        assert false;
        ptr.next = new Node(data,null);
    }
    public void display() {
        Node ptr = head;
        while(ptr!=null) {
            System.out.print(ptr.data+"->");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ex4LinkedList list = new Ex4LinkedList();
        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.insertAtBeginning(3);
        list.insertAtBeginning(4);



        list.display();

        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        list.display();
    }
}

