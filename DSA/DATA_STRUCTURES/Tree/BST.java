package DSA.DATA_STRUCTURES.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BST {
    Node root = null;
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    BST(int[] nodes) {
        for (int node : nodes) {
            root = insert(root, node);
        }
    }

    public Node getRoot() {
        return this.root;
    }

    public Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.data > val) { // Go To Left SubTree
            root.left = insert(root.left, val);
        } else { // Go To Right SubTree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } // CASE 1 : No Child

            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } // CASE 2 : Single Child

            Node IS = inorderSuccessor(root.right); // CASE 3 : Two Children
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    private Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        } return root;
    }

    public boolean searchNode(Node root, int key) { // O(H)
        if (root == null) {
            return false;
        }
        if (key < root.data) {
            return searchNode(root.left, key);
        }
        if (root.data == key) {
            return true;
        }
        return searchNode(root.right, key);
    }

    public void printInRange(Node root, int x, int y) {
        if (root == null) {
            return;
        }
        if (root.data >= x && root.data <= y) {
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        }else if (root.data >= y) {
            printInRange(root.left, x, y);
        } else {
            printInRange(root.right, x, y);
        }
    }

    private void printPaths(List<Integer> path) {
        for (int i = 0; i < path.size() - 1; i++) {
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println(path.get(path.size() - 1));
    }
    public void allPathToLeaf(Node root, List<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
//            System.out.println("Path " + path);
            printPaths(path);
        } else {
            allPathToLeaf(root.left, path);
            allPathToLeaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
//        int[] values = {5,1,3,4,2,7};
//        int[] values = {8,5,3,1,4,6,10,11,14};
        int[] values = {8,5,3,6,10,11,14};
        BST bst = new BST(values);
        Node root = bst.getRoot();
        System.out.println("BST Inorder traversal:");
        bst.inorder(root);
        int key = 6;
        System.out.println("\nSearch key " + key + ":");
        System.out.println((bst.searchNode(root, key))?"Found":"Not Found");

        System.out.println();
        System.out.println("Delete Node 4 (CASE 1)");
        bst.delete(root, 4);
        bst.inorder(root);

        System.out.println("\nDelete Node 10 (CASE 2)");
        bst.delete(root, 10);
        bst.inorder(root);

        System.out.println("\nDelete Node 5 (CASE 3)");
        bst.delete(root, 5);
        bst.inorder(root);

        int x = 6, y = 10;
        System.out.println("\nPrint in range " + x + " to " + y);
        bst.printInRange(root, x, y);

        BST bst2 = new BST(values);
        Node root2 = bst2.getRoot();
        System.out.println("\nAll Paths from Root to Leaf:");
        bst.allPathToLeaf(root2, new ArrayList<>());

    }
}
