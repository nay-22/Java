package DSA.DATA_STRUCTURES.Tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

public class BinaryTree {
    static int idx = -1;
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // parameter : preorder array of nodes
    public Node buildBinaryTree(int[] nodes) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node node = new Node(nodes[idx]);
        node.left = buildBinaryTree(nodes);
        node.right = buildBinaryTree(nodes);
        return node;
    }

    // LDR
    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    // DLR
    public void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    // LRD
    public void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    // BFS
    public void levelorder(Node node) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null) {
                queue.offer(curr.left);
            }
            if (curr.right != null) {
                queue.offer(curr.right);
            }
        }
    }

    // Calculate total no. of nodes
    static int count = 1;
    public int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null) {
            count = 1 + countNodes(root.left);
        }
        if (root.right != null) {
            count = 1 + countNodes(root.right);
        }
        return count;
    }

    // ---------------------  Similar Code ---------------------
    public int countNodesV2(Node root) {
        if (root == null)
            return 0;
        int left = countNodesV2(root.left);
        int right = countNodesV2(root.right);
        return left + right + 1;
    }

    public int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.left);
        return leftSum + rightSum + root.data;
    }

    public int getTreeHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getTreeHeight(root.left);
        int rightHeight = getTreeHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    //Calculate Diameter - O(n^2)
    public int getTreeDiameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDiameter = getTreeDiameter(root.left);
        int rightDiameter = getTreeDiameter(root.right);
        int fullDiameter = getTreeHeight(root.left) + getTreeHeight(root.right) + 1;
        return Math.max(Math.max(leftDiameter, rightDiameter), fullDiameter);
    }

    // Calculate Diameter Optimized - O(n)
    static class TreeStats {
        int height;
        int diameter;
        TreeStats(int h, int d) {
            height = h;
            diameter = d;
        }
    }
    public TreeStats getTreeDiameterOptimized(Node root) {
        if (root == null)
            return new TreeStats(0, 0);
        TreeStats left = getTreeDiameterOptimized(root.left);
        TreeStats right = getTreeDiameterOptimized(root.right);
        int height = Math.max(left.height, right.height) + 1;
        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.height + right.height + 1;
        int finalDiam = Math.max(diam1, Math.max(diam2, diam3));
        return new TreeStats(height, finalDiam);
    }
    public int getTreeDiameterV2(Node root) {
        TreeStats info = getTreeDiameterOptimized(root);
        return info.diameter;
    }
    // ---------------------  Similar Code ---------------------

    // IMP! - Is SubTree?
    public boolean isIdentical(Node root, Node sub) {
        if (root == null && sub == null) {
            return true;
        }
        if (root == null || sub == null) {
            return false;
        }
        if (root.data == sub.data) {
            return isIdentical(root.left, sub.left) && isIdentical(root.right, sub.right);
        }
        return false;
    }
    public boolean isSubTree(Node rootMain, Node rootSub) {
        if (rootSub == null) {
            return true;
        } if (rootMain == null) {
            return false;
        } if (rootMain.data == rootSub.data) {
            if (isIdentical(rootMain, rootSub)) {
                return true;
            }
        }
        return isSubTree(rootMain.left, rootSub) || isSubTree(rootMain.right, rootSub);
    }



    public boolean subTree(Node root, Node sub) {
        if (sub == null)
            return true;
        if (root == null)
            return false;
        if (root.data == sub.data) {
            if (isIdenticalSub(root, sub))
                return true;
        }
        return subTree(root.left, sub) || subTree(root.right, sub);
    }

    public boolean isIdenticalSub(Node root, Node sub) {
        if (root == null && sub == null)
            return true;
        if (root == null || sub == null)
            return false;
        if (root.data == sub.data)
            return isIdenticalSub(root.left, sub.left) && isIdenticalSub(root.right, sub.right);
        return false;
    }


































    // Sum of Nodes at Kth Level
    public int sumOfNodesAtK(Node root, int k) {
        if (root == null) {
            return 0;
        }
        int sum = 0, level = 1, flag = 0;
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                Node node = queue.poll();
                if (level == k) {
                    flag = 1;
                    sum += node.data;
                } else {
                    if (node.left != null)
                        queue.offer(node.left);
                    if (node.right != null)
                        queue.offer(node.right);
                }
            }
            level++;
            if (flag == 1)
                break;
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; //preorder
//        int[] nodes = {9,7,8,-1,-1,1,2,-1,-1,3,-1,-1,4,5,-1,-1,6,-1,-1}; //preorder
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildBinaryTree(nodes);
        System.out.println("Inorder - ");
        tree.inorder(root);
        System.out.println("\nPreorder - ");
        tree.preorder(root);
        System.out.println("\nPostorder - ");
        tree.postorder(root);
        System.out.println("\nLevelorder - ");
        tree.levelorder(root);
        Node temp = new Node(8);
        System.out.println("\nNode count = " + tree.countNodesV2(root));
        System.out.println("Node sum = " + tree.sumOfNodes(root));
        System.out.println("Tree Height = " + tree.getTreeHeight(root));
        System.out.println("Tree Diameter = " + tree.getTreeDiameter(root));
        System.out.println("Tree Diameter V2 = " + tree.getTreeDiameterV2(root));

        BinaryTree.idx = -1;
        int[] subTreeNodes = {1, 2, -1, -1, 3, -1, -1};
        BinaryTree subTree = new BinaryTree();
        Node rootSub = subTree.buildBinaryTree(subTreeNodes);

        System.out.println("Is Subtree => " + subTree.isSubTree(root, rootSub));
        System.out.println("Sum of Nodes at Kth Level = " + tree.sumOfNodesAtK(root, 3));
    }
}
