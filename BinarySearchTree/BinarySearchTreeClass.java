package BinarySearchTree;

public class BinarySearchTreeClass {
	BinarySearchTreeNode root;

	public BinarySearchTreeClass() {
		super();
		this.root = null;
	}
	
	public BinarySearchTreeNode insertBinarySearchTreeNode(BinarySearchTreeNode node, int data) {
		if(node == null) {
			return new BinarySearchTreeNode(data);
		}
		if(data<root.data) {
			node.left = insertBinarySearchTreeNode(node.left,data);
		}else {
			node.right = insertBinarySearchTreeNode(node.right, data);
		}
		return node;
	}
	
	public void insertBinarySearchTreeNode2(int data) {
		if(root == null) {
			root = new BinarySearchTreeNode(data);
			return;
		}
		BinarySearchTreeNode parent = null;
		BinarySearchTreeNode current = root;
		while(current!= null) {
			parent = current;
			if(data<current.data) {
				current = current.left;
			}else{
				current = current.right;
			}
		}
		
		if(data<parent.data) {
			parent.left = new BinarySearchTreeNode(data); 
		}else {
			parent.right = new BinarySearchTreeNode(data); 
		}
	}
	
	public void printInorderTraversal(BinarySearchTreeNode node) {
		if(node == null) {
			return;
		}
		printInorderTraversal(node.left);
		System.out.print(node.data+" ");
		printInorderTraversal(node.right);
	}
	
	public void printpostOrderTraversal(BinarySearchTreeNode node) {
		if(node == null) {
			return;
		}
		printpostOrderTraversal(node.left);
		printpostOrderTraversal(node.right);
		System.out.print(node.data+" ");
	}
	
	public void printpreOrderTraversal(BinarySearchTreeNode node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data+" ");
		printpreOrderTraversal(node.left);
		printpreOrderTraversal(node.right);
	}
	
	public BinarySearchTreeNode searchBSTNode(int data){
        BinarySearchTreeNode current = root;
        while(current!=null){
            if(current.data==data) return current;
            else if(data<=current.data) current = current.left;
            else current=current.right;
        }
        return null;
    }

    public BinarySearchTreeNode searchBSTNodeUsingRecursion(BinarySearchTreeNode root, int data){
        if(root==null) return null;
        if(root.data==data) return root;
        else if(data<=root.data) return searchBSTNodeUsingRecursion(root.left, data);
        else return searchBSTNodeUsingRecursion(root.right, data);
    }

	public BinarySearchTreeNode deleteBinarySearchTreeNode(BinarySearchTreeNode node, int data) {
		return node;
	}
}
