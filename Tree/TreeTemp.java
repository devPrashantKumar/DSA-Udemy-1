package Tree;

import java.util.ArrayList;

public class TreeTemp {
    class TreeNode {
        int data;
        ArrayList<TreeNode> children;

        public TreeNode(int data){
            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    TreeNode root;
    
    public TreeTemp(){
        root = null;
    }

    public void createTree(int data){
        this.root = new TreeNode(data);
    }

    public void addChild(int data){
        TreeNode newTreeNode = new TreeNode(data);
        this.root.children.add(newTreeNode);
    }

    public void printTree(TreeNode root, int level){
        String indentation = " ".repeat(level);
        System.out.println(indentation+root.data);
        for(TreeNode node : root.children){
            printTree(node,level+1);
        }
    }
}