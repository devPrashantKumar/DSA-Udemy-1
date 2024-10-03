package Tree;

public class BinaryTreeNodeUsingArray {
    int[] binaryTreeArray;
    int capacity;

    public BinaryTreeNodeUsingArray(int capacity){
        this.capacity = capacity;
        this.binaryTreeArray = new int[capacity];
    }

    public void addRoot(int data){
        binaryTreeArray[1]=data;
    }

    public void addLeftChild(int root, int data){
        binaryTreeArray[2*root]=data;
    }

    public void addRightChild(int root, int data){
        binaryTreeArray[2*root+1]=data;
    }

    public void printBinaryTree(int root, int level){
        String indentation = " ".repeat(level);
        System.out.println(indentation+binaryTreeArray[root]);
        if(2*root<capacity && binaryTreeArray[2*root]!=0) printBinaryTree(2*root, level+1);
        if(2*root+1<capacity && binaryTreeArray[2*root+1]!=0) printBinaryTree(2*root+1, level+1);
    }

}
