package DSA.scratch;

public class PalindromeLL {
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
        Node n4 = new Node(2);
        Node n5 = new Node(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        return n1;
    }

    private static Node getMid(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private static Node reverse(Node head) {
        if (head == null || head.next == null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static boolean isPalindrome(Node head) {
        if (head == null) return true;
        Node mid = getMid(head);
        Node last = reverse(mid);
        Node front = head;
        while (last != null) {
            if (last.data != front.data) return false;
            last = last.next;
            front = front.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = createLL();
        System.out.println("Is Palindrome : " + isPalindrome(head));
    }
}
