package DSA.DATA_STRUCTURES.REVISE;

import RECURSION.ReverseLinkedList;
import edu.princeton.cs.algs4.In;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

public class SinglyLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    Node head;
    int size;
    SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void addFirst(int data) {
        if (isEmpty()) {
            head = new Node(data);
            size++;
            return;
        }
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        size++;
    }

    public void addBetween(int data, int a, int b) {
        Node ptr = head;
        while (ptr != null) {
            if (ptr.data == a && ptr.next.data == b) {
                Node temp = new Node(data);
                Node A = ptr;
                Node B = ptr.next;
                A.next = temp;
                temp.next = B;
                size++;
                return;
            }
            ptr = ptr.next;
        }
        if (ptr == null) {
            System.out.println("Nodes not found");
        }
    }

    public void addLast(int data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            head = new Node(data);
            size++;
            return;
        }
        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new Node(data);
        size++;
    }

    public int removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked LIst Empty");
            return -1;
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    public boolean remove(int data) {
        if (isEmpty()) {
            System.out.println("Linked List Empty");
            return false;
        }
        Node ptr = head;
        while(ptr.next.data != data) {
            ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
        return true;
    }

    public int removeLast() {
        if (isEmpty()) {
            System.out.println("Linked LIst Empty");
            return -1;
        }
        Node ptr = head;
        while(ptr.next.next != null) {
            ptr = ptr.next;
        }
        int data = ptr.next.data;
        ptr.next = null;
        return data;
    }

    public void display() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " --> ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public int findNthLastNode(int n) {
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (size() - idx == n) {
                return temp.data;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    public boolean deleteNthLastNode(int n) {
        int nodeData = findNthLastNode(n);
        return remove(nodeData);
    }

    public Node reverseLinkedList(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node p = reverseLinkedList(node.next); // Last Node that becomes new head
        node.next.next = node;
        node.next = null;
        return p; // Return the new head
    }

    public boolean isPalindrome() {
        if (isEmpty()) {
            return true;
        }
        SinglyLinkedList proxyList = new SinglyLinkedList();
        Node ptr = head;
        while (ptr != null) {
            proxyList.addLast(ptr.data);
            ptr = ptr.next;
        }
        proxyList.head = proxyList.reverseLinkedList(proxyList.head);
        proxyList.display();
        Node og = head;
        Node rev = proxyList.head;
        while (og != null && rev != null) {
            if (og.data != rev.data) {
                return false;
            }
            og = og.next;
            rev = rev.next;
        }
        return true;
    }

    public int findMiddle() {
        if (isEmpty()) {
            System.out.println("Linked List Empty");
            return -1;
        }
        Node h = head;
        Node t = head;
        while (t != null) {
            if (h.next == null || h.next.next == null) {
                return t.data;
            }
            t = t.next;
            h = h.next.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        LinkedList<Integer> ll = new LinkedList<>();



        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        list.display();


        list.addBetween(4, 3, 3);
        list.display();
//
        int n = 4;
        System.out.println("4th last node: " + list.findNthLastNode(n));

        System.out.println("Delete 4th last node: " + list.deleteNthLastNode(n));
//        list.display();

        System.out.println("isPalindrome : " + list.isPalindrome());



        SinglyLinkedList newList = new SinglyLinkedList();
        newList.addLast(1);
        newList.addLast(2);
        newList.addLast(3);
        newList.addLast(4);
        newList.addLast(5);
        newList.addLast(6);
        newList.addLast(7);

        newList.display();
        System.out.println("Middle of List: " + newList.findMiddle());


    }
}
