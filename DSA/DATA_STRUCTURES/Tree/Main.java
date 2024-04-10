package DSA.DATA_STRUCTURES.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Node<String> n1 = new Node<>("a");
        Node<String> n2 = new Node<>("b");
        Node<String> n3 = new Node<>("c");
        Node<String> n4 = new Node<>("d");
        Node<String> n5 = new Node<>("e");
        Node<String> n6 = new Node<>("f");
        Node<String> n7 = new Node<>("g");

        Tree<String> tree = new Tree<>(n1);
        tree.getRoot().setLeft(n2);
        tree.getRoot().setRight(n3);
        n2.setLeft(n5);
        n2.setRight(n4);
        n3.setLeft(n6);
        n3.setRight(n7);

        System.out.println("\nInorder:");
        tree.inorder(tree.getRoot());
        System.out.println("\n\nPostorder");
        tree.postorder(tree.getRoot());
        System.out.println("\n\nPreorder");
        tree.preorder(tree.getRoot());
        System.out.println("\n\nLevelorder");
        tree.levelorder(tree.getRoot());
        System.out.println("\nFull Binary Tree: " + tree.isFullBinaryTree(tree.getRoot()));

    }
}

class Node<T> {
    private T data;
    private Node<T> left;
    private Node<T> right;
    public Node(T data) {
        this.data = data;
        left = null;
        right = null;
    }
    public T getData() {
        return data;
    }
    public Node<T> getLeft() {
        return left;
    }
    public Node<T> getRight() {
        return right;
    }
    public void setData(T data) {
        this.data = data;
    }
    public void setLeft(Node<T> left) {
        this.left = left;
    }
    public void setRight(Node<T> right) {
        this.right = right;
    }
}

class Tree<T> {
    private Node<T> root;
    public Tree(Node<T> root) {
        this.root = root;
    }
    public Node<T> getRoot() {
        return root;
    }
    public void setRoot(Node<T> root) {
        this.root = root;
    }
    public void inorder(Node<T> root) {
        if(root != null) {
            inorder(root.getLeft());
            System.out.print(root.getData()+" -> ");
            inorder(root.getRight());
        }
    }
    public void postorder(Node<T> root) {
        if(root != null) {
            postorder(root.getLeft());
            postorder(root.getRight());
            System.out.print(root.getData()+" -> ");
        }
    }
    public void preorder(Node<T> root) {
        if(root != null) {
            System.out.print(root.getData()+" -> ");
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }
    public void levelorder(Node<T> root) {
        if(root == null) {
            return;
        }
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()) {
            Node<T> node = queue.remove();
//*********** To print each level on different line *************
            if(node == null) {
                if(queue.isEmpty()) {
                    return;
                }
                queue.remove(null);
                queue.add(null);
                System.out.println();
                continue;
            }
//*********** To print each level on different line ************
            System.out.print(node.getData() + " -> ");
            if(node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if(node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
    }
    public boolean isFullBinaryTree(Node<T> root) {
        if((root == null) || (root.getLeft() == null && root.getRight() == null)) {
            return true;
        }
        if(root.getLeft() != null && root.getRight()!=null) {
            return isFullBinaryTree(root.getLeft()) && isFullBinaryTree(root.getRight());
        }
        return false;
    }
    public boolean isPerfectBinaryTree(Node<T> root) {
//        if(root == null) {
//            return true;
//        }
//        return false;
        return root == null;

    }
}

