package DSA.scratch;

import javax.swing.tree.TreeNode;
import java.util.*;

public class BT {
    static class Node {
        int val;
        Node left;
        Node right;
        Node (int data) {
            val = data;
        }
    }

    public Node constructTree() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.right = n6;

        return n1;
    }

    public void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public void levelorder(Node root) {
        Deque<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print(curr.val + " ");
            if (curr.left != null) queue.offer(curr.left);
            if (curr.right != null) queue.offer(curr.right);
        }
    }

    public boolean searchInorder(Node root, int key) {
        if (root == null) return false;
        if (root.val == key) return true;
        return searchInorder(root.left, key) || searchInorder(root.right, key);
    }

    public int treeSum (Node root) {
        if (root == null) return 0;
        int leftTreeSum = treeSum(root.left);
        int rightTreeSum = treeSum(root.right);
        return leftTreeSum + rightTreeSum + root.val;
    }

    public int treeNodeCount (Node root) {
        if (root == null) return 0;
        int leftCount = treeNodeCount(root.left);
        int rightCount = treeNodeCount(root.right);
        return leftCount + rightCount + 1;
    }

    public int treeHeight (Node root) {
        if (root == null) return 0;
        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int treeMinValue (Node root) {
        if (root == null) return Integer.MAX_VALUE;
        int leftMin = treeMinValue(root.left);
        int rightMin = treeMinValue(root.right);
        return Math.min(root.val, Math.min(leftMin, rightMin));
    }

    public int treeMaxValue (Node root) {
        if (root == null) return Integer.MIN_VALUE;
        int leftMax = treeMaxValue(root.left);
        int rightMax = treeMaxValue(root.right);
        return Math.max(root.val, Math.max(leftMax, rightMax));
    }

    public int maxPathToLeaf(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        if (root.left == null && root.right == null) return root.val;
        int maxChild = Math.max(maxPathToLeaf(root.left), maxPathToLeaf(root.right));
        return root.val + maxChild;
    }

    public List<List<Integer>> zigZagLevelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();
        boolean flag = false;
        if(root == null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int qsize = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0;i<qsize;i++){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                temp.add(q.poll().val);
            }
            flag = !flag;
            if(!flag) Collections.reverse(temp);
            ans.add(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        BT tree = new BT();
        Node root = tree.constructTree();
        tree.inorder(root);
        System.out.println();
        tree.preorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.levelorder(root);
        System.out.println();
        System.out.println("Found 4? => " + tree.searchInorder(root, 4));
        System.out.println("Found 8? => " + tree.searchInorder(root, 8));
        System.out.println("Sum of Nodes = " + tree.treeSum(root));
        System.out.println("Tree Node Count = " + tree.treeNodeCount(root));
        System.out.println("Tree Height = " + tree.treeHeight(root));
        System.out.println("Tree Min Value = " + tree.treeMinValue(root));
        System.out.println("Tree Max Value = " + tree.treeMaxValue(root));
        System.out.println("Max Path to Leaf = " + tree.maxPathToLeaf(root));
        System.out.println("Zig Zag Traversal:\n" + tree.zigZagLevelOrder(root));
    }
}
