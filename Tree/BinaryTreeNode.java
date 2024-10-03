package Tree;

public class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int data){
        this.data = data;
    }

    public void addLeftChild(BinaryTreeNode child){
        this.left = child;
    }

    public void addRightChild(BinaryTreeNode child){
        this.right = child;
    }

    public void printBinaryTree(int level){
        String indentation = " ".repeat(level);
        System.out.println(indentation+data);
        if(left!=null)left.printBinaryTree(level+1);
        if(right!=null)right.printBinaryTree(level+1);
    }
}
