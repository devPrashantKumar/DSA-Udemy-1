package DataStructures.BinarySearchTree.BalancedBinarySearchTree.AVLTree;

public class AVLTreeClassTest {
    public static void main(String[] args) {
        AVLTreeClass avl = new AVLTreeClass();

        // Insert nodes into the AVL tree
        avl.insert(10);
        avl.insert(20);
        avl.insert(30);
        avl.insert(40);
        avl.insert(50);
        avl.insert(25);

        System.out.println("In-order Traversal after inserts:");
        avl.printInOrderTraversal();

        System.out.println("Pre-order Traversal after inserts:");
        avl.printPreOrderTraversal();

        // Deleting nodes from the AVL tree
        System.out.println("\nDeleting node with value 40:");
        avl.delete(40);
        avl.printInOrderTraversal();
        avl.printPreOrderTraversal();

        System.out.println("\nDeleting node with value 10:");
        avl.delete(10);
        avl.printInOrderTraversal();
        avl.printPreOrderTraversal();

        System.out.println("\nDeleting node with value 50:");
        avl.delete(50);
        avl.printInOrderTraversal();
        avl.printPreOrderTraversal();

        System.out.println("\nDeleting node with value 25:");
        avl.delete(25);
        avl.printInOrderTraversal();
        avl.printPreOrderTraversal();
    }
}
