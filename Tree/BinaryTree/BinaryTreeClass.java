package Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeClass {
    BinaryTreeNode root;

    public BinaryTreeClass(){
        this.root=null;
    }

    public void printBinaryTree(BinaryTreeNode root, int level) throws RuntimeException{
        if(root==null) throw new RuntimeException("Empty Tree");
        String indentation = " ".repeat(level);
        System.out.println(indentation+root.data);
        if(root.left!=null) printBinaryTree(root.left, level+1);
        if(root.right!=null) printBinaryTree(root.right, level+1);
    }

    public void preOrderTraversal(BinaryTreeNode root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void inOrderTraversal(BinaryTreeNode root){
        if(root==null) return;
        preOrderTraversal(root.left);
        System.out.print(root.data+" ");
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal(BinaryTreeNode root){
        if(root==null) return;
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }

    public void levelOrderTraversal(){
        Queue<BinaryTreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty()){
            BinaryTreeNode node = nodeQueue.remove();
            System.out.print(node.data+" ");
            if(node.left!=null)nodeQueue.add(node.left);
            if(node.right!=null)nodeQueue.add(node.right);
        }
    }

    public void addLeftChild(BinaryTreeNode root, int data){
        root.left = new BinaryTreeNode(data);
    }

    public void addRightChild(BinaryTreeNode root, int data){
        root.right = new BinaryTreeNode(data);
    }

    public void addRoot(int data){
        this.root = new BinaryTreeNode(data);
    }


}
