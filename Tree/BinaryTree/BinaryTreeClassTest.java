package Tree.BinaryTree;

public class BinaryTreeClassTest {
    public static void main(String[] args) {
        BinaryTreeClass btc = new BinaryTreeClass();
        try {
            btc.printBinaryTree(btc.root, 0);
        } catch (Exception e) {
           System.out.println(e);
        }

        btc.preOrderTraversal(btc.root);
        System.out.println();

        btc.addRoot(11);
        btc.addLeftChild(btc.root, 12);
        btc.addRightChild(btc.root, 13);
        btc.addLeftChild(btc.root.left, 14);
        btc.addRightChild(btc.root.left, 15);
        btc.addLeftChild(btc.root.right, 16);
        btc.addRightChild(btc.root.right, 17);
        btc.addLeftChild(btc.root.left.left, 18);
        btc.addRightChild(btc.root.left.left, 19);

        btc.preOrderTraversal(btc.root);
        System.out.println();
        btc.inOrderTraversal(btc.root);
        System.out.println();
        btc.postOrderTraversal(btc.root);
        System.out.println();
        btc.levelOrderTraversal();


    }
    
}
