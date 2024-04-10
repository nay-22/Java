package RECURSION;

public class ReverseLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public void setNext(Node node) {
            this.next = node;
        }

        public Node getNext() {
            return this.next;
        }

        public int getValue() {
            return this.data;
        }
    }

    public static Node reverseLinkedList(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node p = reverseLinkedList(node.next); // Last Node that becomes new head
        node.next.next = node;
        node.next = null;
        return p; // Return the new head
    }

    private static void printLinkedList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.getValue() + " -> ");
            temp = temp.getNext();
        }
        System.out.print("Null");
    }

    public static void runReversedLinkedList() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7);

        System.out.println("Original Linked List");
        printLinkedList(n1);
        System.out.println("\nReversed Linked List");
        Node reversed = reverseLinkedList(n1);
        printLinkedList(reversed);
    }

    public static Node mergeSortedLists(Node A, Node B) {
        if (A == null) return B;
        if (B == null) return A;
        if (A.data < B.data) {
            A.next = mergeSortedLists(A.next, B);
            return A;
        } else {
            B.next = mergeSortedLists(B.next, A);
            return B;
        }
    }

    public static void runMergeTwoSortedLinkedLists() {
        Node n1_1 = new Node(1);
        Node n1_2 = new Node(8);
        Node n1_3 = new Node(22);
        Node n1_4 = new Node(40);

        Node n2_1 = new Node(4);
        Node n2_2 = new Node(11);
        Node n2_3 = new Node(16);
        Node n2_4 = new Node(20);

        n1_1.setNext(n1_2);
        n1_2.setNext(n1_3);
        n1_3.setNext(n1_4);

        n2_1.setNext(n2_2);
        n2_2.setNext(n2_3);
        n2_3.setNext(n2_4);

        System.out.println("Sorted Linked List A");
        printLinkedList(n1_1);
        System.out.println("\nSorted Linked List B");
        printLinkedList(n2_1);
        System.out.println("\nMerged Linked List");
        Node head = mergeSortedLists(n1_1, n2_1);
        printLinkedList(head);
    }



    public static void main (String[] args) {
        runReversedLinkedList();
//        runMergeTwoSortedLinkedLists();
    }
}