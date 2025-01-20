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
        System.out.println();

        System.out.println("15 is available "+btc.searchUsingRecursion(btc.root, 15));
        System.out.println("20 is available "+btc.searchUsingRecursion(btc.root, 20));
        System.out.println("15 is available "+btc.searchUsinglevelOrderTraversal(15));
        System.out.println("20 is available "+btc.searchUsinglevelOrderTraversal(20));

        BinaryTreeClass btc2 = new BinaryTreeClass();
        btc2.insertBinaryTreeNode(11);
        btc2.insertBinaryTreeNode(12);
        btc2.insertBinaryTreeNode(13);
        btc2.insertBinaryTreeNode(14);
        btc2.insertBinaryTreeNode(15);
        btc2.insertBinaryTreeNode(16);
        btc2.insertBinaryTreeNode(17);
        btc2.insertBinaryTreeNode(18);
        btc2.insertBinaryTreeNode(19);
        btc2.levelOrderTraversal();
        System.out.println();
        btc2.deleteBinaryTreeNode(13);
        btc2.levelOrderTraversal();
        System.out.println();
    }
    
}
