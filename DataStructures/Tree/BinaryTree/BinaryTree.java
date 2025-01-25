package DataStructures.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    class BinaryTreeNode {
        int data;
        BinaryTreeNode left;
        BinaryTreeNode right;

        public BinaryTreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public void addLeftChild(int data) {
            this.left = new BinaryTreeNode(data);
        }

        public void addRightChild(int data) {
            this.right = new BinaryTreeNode(data);
        }

        public BinaryTreeNode getLeftChild() {
            return this.left;
        }

        public BinaryTreeNode getRightChild() {
            return this.right;
        }
    }

    BinaryTreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void printBinaryTree() throws RuntimeException {
        printBinaryTreeUtil(this.root,0);
    }

    private void printBinaryTreeUtil(BinaryTreeNode root, int level) throws RuntimeException {
        if (root == null)
            throw new RuntimeException("Empty Tree");
        String indentation = " ".repeat(level);
        System.out.println(indentation + root.data);
        if (root.left != null)
        printBinaryTreeUtil(root.left, level + 1);
        if (root.right != null)
        printBinaryTreeUtil(root.right, level + 1);
    }

    public void preOrderTraversal() {
        preOrderTraversalUtil(this.root);
    }

    private void preOrderTraversalUtil(BinaryTreeNode root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrderTraversalUtil(root.left);
        preOrderTraversalUtil(root.right);
    }

    public void inOrderTraversal() {
        inOrderTraversalUtil(this.root);
    }

    private void inOrderTraversalUtil(BinaryTreeNode root) {
        if (root == null)
            return;
        inOrderTraversalUtil(root.left);
        System.out.print(root.data + " ");
        inOrderTraversalUtil(root.right);
    }

    public void postOrderTraversal() {
        postOrderTraversalUtil(this.root);
    }

    private void postOrderTraversalUtil(BinaryTreeNode root) {
        if (root == null)
            return;
        postOrderTraversalUtil(root.left);
        postOrderTraversalUtil(root.right);
        System.out.print(root.data + " ");
    }

    public void levelOrderTraversal() {
        Queue<BinaryTreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            BinaryTreeNode node = nodeQueue.remove();
            System.out.print(node.data + " ");
            if (node.left != null)
                nodeQueue.add(node.left);
            if (node.right != null)
                nodeQueue.add(node.right);
        }
    }

    public boolean searchUsinglevelOrderTraversal(int data) {
        Queue<BinaryTreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            BinaryTreeNode node = nodeQueue.remove();
            if (data == node.data)
                return true;
            if (node.left != null)
                nodeQueue.add(node.left);
            if (node.right != null)
                nodeQueue.add(node.right);
        }
        return false;
    }


    public boolean searchUsingRecursion(BinaryTreeNode root, int data) {
        if (root == null) {
            return false;
        }

        if (root.data == data)
            return true;
        boolean left = (root.left != null) ? searchUsingRecursion(root.left, data) : false;
        boolean right = (root.right != null) ? searchUsingRecursion(root.right, data) : false;
        return left || right;
    }

    public void addLeftChild(BinaryTreeNode root, int data) {
        root.left = new BinaryTreeNode(data);
    }

    public void addRightChild(BinaryTreeNode root, int data) {
        root.right = new BinaryTreeNode(data);
    }

    public void addRoot(int data) {
        this.root = new BinaryTreeNode(data);
    }

    public void insertBinaryTreeNode(int data) {
        BinaryTreeNode newNode = new BinaryTreeNode(data);
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        if (root == null) {
            root = newNode;
            return;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.remove();
            if (current.left == null) {
                current.left = newNode;
                break;
            } else if (current.right == null) {
                current.right = newNode;
                break;
            } else {
                queue.add(current.left);
                queue.add(current.right);
            }
        }
    }

    public void deleteBinaryTreeNode(int data) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.remove();
            if (current.data == data) {
                BinaryTreeNode lasttreeNode = this.getLastTreeNode();
                current.data = lasttreeNode.data;
                this.deleteLastNode();
                break;
            } else {
                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            }
        }
    }

    private BinaryTreeNode getLastTreeNode() {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        BinaryTreeNode prev = null;
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.remove();
            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
            prev = current;
        }
        return prev;
    }

    private void deleteLastNode() {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            root = null;
            return;
        }

        BinaryTreeNode prev = null, current = null;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            current = queue.remove();
            if (current.left == null) {
                if (prev == null) {
                    root = null;
                } else {
                    prev.right = null;
                    break;
                }
            } else if (current.right == null) {
                current.left = null;
                break;
            } else {
                queue.add(current.left);
                queue.add(current.right);
                prev = current;
            }
        }
    }

}
