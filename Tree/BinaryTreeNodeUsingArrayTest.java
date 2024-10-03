package Tree;

public class BinaryTreeNodeUsingArrayTest {
    public static void main(String[] args) {
        BinaryTreeNodeUsingArray binaryTreeNodeUsingArray = new BinaryTreeNodeUsingArray(10);
        binaryTreeNodeUsingArray.addRoot(10);
        binaryTreeNodeUsingArray.addLeftChild(1, 11);
        binaryTreeNodeUsingArray.addRightChild(1, 12);
        binaryTreeNodeUsingArray.addLeftChild(2, 13);
        binaryTreeNodeUsingArray.addRightChild(2, 14);
        binaryTreeNodeUsingArray.addLeftChild(4, 15);
        binaryTreeNodeUsingArray.printBinaryTree(1, 0);
       
    }
}
