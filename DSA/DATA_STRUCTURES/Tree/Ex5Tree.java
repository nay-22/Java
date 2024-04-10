package DSA.DATA_STRUCTURES.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Ex5Tree {
    private TreeNode root;

    public Ex5Tree(TreeNode root) {
        this.root = root;
    }

    public void inorder(TreeNode root) {
        if(root!=null) {
            inorder(root.getLeft());
            System.out.print(root.getData()+"->");
            inorder(root.getRight());
        }
    }

    public void preorder(TreeNode root) {
        if(root!=null) {
            System.out.print(root.getData()+"->");
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }

    public void postorder(TreeNode root) {
        if(root!=null) {
            postorder(root.getLeft());
            postorder(root.getRight());
            System.out.print(root.getData()+"->");
        }
    }

    public void levelorder(TreeNode root) {
        if(root==null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.getData() + "->");
            if(node.getLeft() != null) {
                queue.offer(node.getLeft());
            }
            if(node.getRight() != null) {
                queue.offer(node.getRight());
            }
        }

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        root.setLeft(n2);
        root.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);

        Ex5Tree tree = new Ex5Tree(root);

        System.out.println("\nInorder");
        tree.inorder(root);
        System.out.println("\nPostorder");
        tree.postorder(root);
        System.out.println("\nPreorder");
        tree.preorder(root);
        System.out.println("\nLevelorder");
        tree.levelorder(root);

    }

}

class TreeNode {
    private final int data;
    private TreeNode right;
    private TreeNode left;
    public TreeNode(int data) {
        this.data = data;
    }
    public void setLeft(TreeNode node) {
        this.left = node;
    }
    public void setRight(TreeNode node) {
        this.right = node;
    }
    public int getData() {
        return data;
    }
    public TreeNode getRight() {
        return right;
    }
    public TreeNode getLeft() {
        return left;
    }
}
