package Tree.GenericTree;

import java.util.ArrayList;

public class TreeNode {
    int data;
    ArrayList<TreeNode> children;

    public TreeNode(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
    }

    public void printTree(int level){
        String indentation = " ".repeat(level);
        System.out.println(indentation+data);
        for(TreeNode node : children){
            node.printTree(level+1);
        }
    }
}