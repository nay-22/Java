package DSA.scratch;

public class LL {
    private static class Node {
        int data;
        Node next;
        Node(int val) {
            data = val;
            next = null;
        }
    }

    public static Node createLL() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;

        return n1;
    }

    public static Node[] createLL2() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;

        Node n21 = new Node(1);
        Node n22 = new Node(2);
        n21.next = n22;
        n22.next = n4;

        return new Node[]{n1, n21};
    }

    public static Node createLL3() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n5;

        return n1;
    }

    public static Node createLL4() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        Node n4 = new Node(2);
        Node n5 = new Node(3);
        Node n6 = new Node(3);
        Node n7 = new Node(4);
        Node n8 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;

        return n1;
    }

    public static Node KthFromLast (Node head, int k) {
        Node p1 = head;
        Node p2 = head.next.next;
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    public static boolean isIntersection(Node h1, Node h2) {
        Node p1 = h1;
        Node p2 = h2;
        while (p1.next != null) {
            p1 = p1.next;
        }
        while (p2.next != null) {
            p2 = p2.next;
        }
        return p1.equals(p2);
    }

    public static boolean isLoopPresent (Node head) {
        Node p1 = head, p2 = head;
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1.equals(p2)) return true;
        }
        return false;
    }

    public static Node intersectionPoint(Node h1, Node h2) {
        int c1 = 1, c2 = 1;
        Node p1 = h1, p2 = h2;
        while (p1.next != null) {
            c1++;
            p1 = p1.next;
        }while (p2.next != null) {
            c2++;
            p2 = p2.next;
        }
        int c3 = c1 - c2;
        p1 = h1;
        p2 = h2;
        for (int i = 0; i < c3; i++) p1 = p1.next;
        while (!p1.equals(p2)) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    public static void printLL(Node head) {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " -> ");
            p = p.next;
        }
        System.out.println();
    }

    public static void removeDuplicates (Node head) {
        Node p = head;
        while (p.next != null) {
            if (p.data == p.next.data)
                p.next = p.next.next;
            else
                p = p.next;
        }
    }

    public static Node moveLastToFront(Node head) {
        Node p = head;
        while (p.next.next != null) {
            p = p.next;
        }
        p.next.next = head;
        Node temp = p;
        head = p.next;
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node head = createLL();
//        int k = 3;
//        System.out.println("Node " + k + " from last = " + KthFromLast(head,k).data);

//        Node[] heads = createLL2();
//        Node h1 = heads[0];
//        Node h2 = heads[1];
//        System.out.println("Intersection present: " + isIntersection(h1, h2));

//        Node h3 = createLL3();
//        System.out.println("Loop present: " + isLoopPresent(h3));

//        Node[] heads = createLL2();
//        Node h1 = heads[0];
//        Node h2 = heads[1];
//        System.out.println("Intersection point: " + intersectionPoint(h1, h2).data);

//        Node h4 = createLL4();
//        printLL(h4);
//        removeDuplicates(h4);
//        printLL(h4);

        Node h5 = createLL();
        printLL(h5);
        h5 = moveLastToFront(h5);
        printLL(h5);



    }
}
