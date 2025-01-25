package DataStructures.BinarySearchTree.BalancedBinarySearchTree.AVLTree;

public class AVLTreeClass {
    class AVLTreeNode {
        int data, height;
        AVLTreeNode left, right;

        public AVLTreeNode(int data) {
            this.data = data;
            this.height = 1;
        }
    }

    private AVLTreeNode root;

    public AVLTreeClass() {
        this.root = null;
    }

    // Utility to get the height of the node
    private int height(AVLTreeNode node) {
        return (node == null) ? 0 : node.height;
    }

    // Utility to calculate the balance factor
    private int getBalance(AVLTreeNode node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    // Right rotate
    private AVLTreeNode rightRotate(AVLTreeNode y) {
        AVLTreeNode x = y.left;
        AVLTreeNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left rotate
    private AVLTreeNode leftRotate(AVLTreeNode x) {
        AVLTreeNode y = x.right;
        AVLTreeNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert a node
    public void insert(int data) {
        root = insertNode(root, data);
    }

    private AVLTreeNode insertNode(AVLTreeNode node, int data) {
        if (node == null) {
            return new AVLTreeNode(data);
        }

        if (data < node.data) {
            node.left = insertNode(node.left, data);
        } else if (data > node.data) {
            node.right = insertNode(node.right, data);
        } else {
            return node; // Duplicates are not allowed
        }

        // Update the height of this node
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Check the balance factor and perform rotations if unbalanced
        int balance = getBalance(node);

        // Left Left Case
        if (balance > 1 && data < node.left.data) {
            return rightRotate(node);
        }

        // Right Right Case
        if (balance < -1 && data > node.right.data) {
            return leftRotate(node);
        }

        // Left Right Case
        if (balance > 1 && data > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && data < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Delete a node
    public void delete(int data) {
        root = deleteNode(root, data);
    }

    private AVLTreeNode deleteNode(AVLTreeNode root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = deleteNode(root.left, data);
        } else if (data > root.data) {
            root.right = deleteNode(root.right, data);
        } else {
            // Node to be deleted found

            // Case 1: Node has no children (leaf node)
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: Node has one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: Node has two children
            // Find the in-order successor (smallest in the right subtree)
            root.data = minValue(root.right);

            // Delete the in-order successor
            root.right = deleteNode(root.right, root.data);
        }

        // Update the height of the current node
        root.height = Math.max(height(root.left), height(root.right)) + 1;

        // Check the balance factor and perform rotations if unbalanced
        int balance = getBalance(root);

        // Left Left Case
        if (balance > 1 && getBalance(root.left) >= 0) {
            return rightRotate(root);
        }

        // Right Right Case
        if (balance < -1 && getBalance(root.right) <= 0) {
            return leftRotate(root);
        }

        // Left Right Case
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Left Case
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    // Utility to find the minimum value node
    private int minValue(AVLTreeNode node) {
        int minValue = node.data;
        while (node.left != null) {
            minValue = node.left.data;
            node = node.left;
        }
        return minValue;
    }

    // In-order traversal
    public void printInOrderTraversal() {
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(AVLTreeNode node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.data + " ");
            printInOrder(node.right);
        }
    }

    // Pre-order traversal
    public void printPreOrderTraversal() {
        printPreOrder(root);
        System.out.println();
    }

    private void printPreOrder(AVLTreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }
}
