package Tree.BinaryTreeUsingArray.BinaryTreeArrayExtra;

public class BinaryTreeNodeUsingArrayTest {
    public static void main(String[] args) {
        BinaryTreeNodeUsingArray binaryTreeNodeUsingArray = new BinaryTreeNodeUsingArray(10);
        binaryTreeNodeUsingArray.addRoot(10);
        binaryTreeNodeUsingArray.addLeftChild(0, 11);
        binaryTreeNodeUsingArray.addRightChild(0, 12);
        binaryTreeNodeUsingArray.addLeftChild(1, 13);
        binaryTreeNodeUsingArray.addRightChild(1, 14);
        binaryTreeNodeUsingArray.addLeftChild(3, 15);
        binaryTreeNodeUsingArray.printBinaryTree(0, 0);       
    }
}
