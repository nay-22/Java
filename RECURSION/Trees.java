package RECURSION;

import java.util.List;

public class Trees {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right =null;
        }
    }

    public static Node insert(Node head, int data) {
        if (head == null) {
            head = new Node(data);
            return head;
        }
        if (data > head.data) {
            head.right =  insert(head.right, data);
        } else {
            head.left =  insert(head.left, data);
        }
        return head;
    }

    public static void printLeafNodes(Node node) {
        if (node == null) {
            System.out.println("Null Tree");
            return;
        };
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
            return;
        }
        if (node.left != null) {
            printLeafNodes(node.left);
        }
        if (node.right != null) {
            printLeafNodes(node.right);
        }
    }

    public static void main(String[] args) {
        Node n100 = new Node(100);
        Node n80 = new Node(80);
        Node n120 = new Node(120);
        Node n50 = new Node(50);
        Node n90 = new Node(90);
        Node n110 = new Node(110);
        Node n140 = new Node(140);
        Node n30 = new Node(30);
        Node n60 = new Node(60);
        Node n85 = new Node(85);
        Node n95 = new Node(95);
        Node n115 = new Node(115);
        Node n150 = new Node(150);
        n100.left = n80;
        n100.right = n120;
        n80.left = n50;
        n80.right = n90;
        n50.left = n30;
        n50.right = n60;
        n90.left = n85;
        n90.right = n95;
        n120.left = n110;
        n120.right = n140;
        n110.right = n115;
        n140.right = n150;

        Node head = insert(n100, 108);

        printLeafNodes(n100);
    }
}
