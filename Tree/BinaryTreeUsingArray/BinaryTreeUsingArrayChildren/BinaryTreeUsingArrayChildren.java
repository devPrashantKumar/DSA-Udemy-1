package Tree.BinaryTreeUsingArray.BinaryTreeUsingArrayChildren;

public class BinaryTreeUsingArrayChildren {
    class BinaryTreeNode{
        int data;
        BinaryTreeNode[] children;

        public BinaryTreeNode(int data){
            this.data = data;
            this.children = new BinaryTreeNode[2];
        }

        public void addLeftChild(int data){
            this.children[0] = new BinaryTreeNode(data);
        }
    
        public void addRightChild(int data){
            this.children[1] = new BinaryTreeNode(data);
        }

        public BinaryTreeNode getLeftChild(){
            return this.children[0];
        }
    
        public BinaryTreeNode getRightChild(){
            return this.children[1];
        }
    }

    BinaryTreeNode root;

    public BinaryTreeUsingArrayChildren(){
        root = null;
    }

    public void createRoot(int data){
        this.root = new BinaryTreeNode(data);
    }

    public BinaryTreeNode getRoot(){
        return this.root;
    }

    public void printTree(){
        printTreeUtil(this.root,0);
    }

    public void printTreeUtil(BinaryTreeNode root, int level){
        String indentation = " ".repeat(level);
        System.out.println(indentation+root.data);
        if(root.children[0]!=null) printTreeUtil(root.children[0],level+1);            
        if(root.children[1]!=null) printTreeUtil(root.children[1],level+1);
    }
}
