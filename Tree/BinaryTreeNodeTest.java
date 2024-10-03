package Tree;

public class BinaryTreeNodeTest {
    public static void main(String[] args) {
        BinaryTreeNode node1 = new BinaryTreeNode(10);
        BinaryTreeNode node2 = new BinaryTreeNode(11);
        BinaryTreeNode node3 = new BinaryTreeNode(12);
        BinaryTreeNode node4 = new BinaryTreeNode(13);
        BinaryTreeNode node5 = new BinaryTreeNode(14);
        BinaryTreeNode node6 = new BinaryTreeNode(15);
    
        BinaryTreeNode root = node1;
        node1.addLeftChild(node2);
        node1.addRightChild(node3);
        node2.addLeftChild(node4);
        node3.addLeftChild(node5);
        node3.addRightChild(node6);

        root.printBinaryTree(0);
    }
}
