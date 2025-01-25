package DataStructures.Tree.BinaryTreeUsingArray.BinaryTreeNodeUsingArrayChildren;

public class BinaryTreeNodeUsingArrayChildren {
    int data;
    BinaryTreeNodeUsingArrayChildren[] children;

    public BinaryTreeNodeUsingArrayChildren(int data){
        this.data = data;
        this.children = new BinaryTreeNodeUsingArrayChildren[2];
    }

    public void addLeftChild(BinaryTreeNodeUsingArrayChildren child){
        this.children[0] = child;
    }

    public void addRightChild(BinaryTreeNodeUsingArrayChildren child){
        this.children[1] = child;
    }

    public void printBinaryTree(int level){
        String indentation = " ".repeat(level);
        System.out.println(indentation+data); 
        if(children[0]!=null) children[0].printBinaryTree(level+1);
        if(children[1]!=null) children[1].printBinaryTree(level+1);
    }
}
