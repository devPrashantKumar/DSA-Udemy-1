package Tree;

import java.util.ArrayList;

public class Tree {
    class TreeNode {
        int data;
        ArrayList<TreeNode> children;

        public TreeNode(int data){
            this.data = data;
            this.children = new ArrayList<>();
        }

        public TreeNode getChild(int index){
            return this.children.get(index);
        }

        public void addChild(int data){
            this.children.add(new TreeNode(data));
        }
    }

    TreeNode root;
    
    public Tree(){
        root = null;
    }

    public void createRoot(int data){
        this.root = new TreeNode(data);
    }

    public TreeNode getRoot(){
        return this.root;
    }

    public void printTree(TreeNode root, int level){
        String indentation = " ".repeat(level);
        System.out.println(indentation+root.data);
        for(TreeNode node : root.children){
            printTree(node,level+1);
        }
    }
}