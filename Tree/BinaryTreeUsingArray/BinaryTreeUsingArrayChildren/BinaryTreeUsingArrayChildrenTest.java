package Tree.BinaryTreeUsingArray.BinaryTreeUsingArrayChildren;

import Tree.BinaryTreeUsingArray.BinaryTreeUsingArrayChildren.BinaryTreeUsingArrayChildren.BinaryTreeNode;

public class BinaryTreeUsingArrayChildrenTest {
    public static void main(String[] args) {
        BinaryTreeUsingArrayChildren binaryTree = new BinaryTreeUsingArrayChildren();

        binaryTree.createRoot(1);

        BinaryTreeNode root = binaryTree.getRoot();
        root.addLeftChild(2);
        root.addRightChild(3);

        BinaryTreeNode child1 = binaryTree.getRoot().getLeftChild();
        child1.addLeftChild(4);
        child1.addRightChild(5);

        BinaryTreeNode child2 = binaryTree.getRoot().getRightChild();
        child2.addRightChild(6);

        binaryTree.printTree();
    }
}
