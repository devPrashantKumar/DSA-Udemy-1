package BinarySearchTree;

public class BinarySearchTreeClass {
	BinarySearchTreeNode root;

	public BinarySearchTreeClass() {
		this.root = null;
	}


	public void insertBinarySearchTreeNode(int data){
		this.root = insertBinarySearchTreeNodeUtil(this.root,data);
	}

	public BinarySearchTreeNode insertBinarySearchTreeNodeUtil(BinarySearchTreeNode node, int data) {
		if(node == null) {
			return new BinarySearchTreeNode(data);
		}
		if(data<node.data) {
			node.left = insertBinarySearchTreeNodeUtil(node.left,data);
		}else {
			node.right = insertBinarySearchTreeNodeUtil(node.right, data);
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

	public void printInorderTraversal(){
		printInorderTraversalUtil(this.root);
	}
	
	private void printInorderTraversalUtil(BinarySearchTreeNode node) {
		if(node == null) {
			return;
		}
		printInorderTraversalUtil(node.left);
		System.out.print(node.data+" ");
		printInorderTraversalUtil(node.right);
	}
	
	public void printpostOrderTraversal(){
		printpostOrderTraversalUtil(this.root);
	}

	private void printpostOrderTraversalUtil(BinarySearchTreeNode node) {
		if(node == null) {
			return;
		}
		printpostOrderTraversalUtil(node.left);
		printpostOrderTraversalUtil(node.right);
		System.out.print(node.data+" ");
	}
	
	public void printpreOrderTraversal(){
		printpreOrderTraversalUtil(this.root);
	}

	private void printpreOrderTraversalUtil(BinarySearchTreeNode node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data+" ");
		printpreOrderTraversalUtil(node.left);
		printpreOrderTraversalUtil(node.right);
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

	public void searchBSTNodeUsingRecursion(int data){
		searchBSTNodeUsingRecursionUtil(this.root, data);
	}

    private BinarySearchTreeNode searchBSTNodeUsingRecursionUtil(BinarySearchTreeNode root, int data){
        if(root==null) return null;
        if(root.data==data) return root;
        else if(data<=root.data) return searchBSTNodeUsingRecursionUtil(root.left, data);
        else return searchBSTNodeUsingRecursionUtil(root.right, data);
    }

	public BinarySearchTreeNode deleteBinarySearchTreeNode(int data){
		return deleteBinarySearchTreeNodeUtil(this.root, data);
	}
	private BinarySearchTreeNode deleteBinarySearchTreeNodeUtil(BinarySearchTreeNode node, int data) {
		if(node==null)  return null;
		BinarySearchTreeNode parent = null;
		BinarySearchTreeNode current = node;
		while(current!=null && current.data!=data){
			parent = current;
			if(data<current.data){
				current = current.left;
			}
			else{
				current = current.right;
			}
		}
		if(current==null) return null;
		if(current.left==null && current.right==null){
			if(parent==null) root=null;
			else if(parent.left==current) parent.left=null;
			else if(parent.right==current) parent.right=null;
			return current;
		}
		else if(current.left==null){
			if(parent.left==current) parent.left = current.right;
			else if(parent.right==current) parent.right=current.right;
			return current;
		}
		else if(current.right==null){
			if(parent.left==current) parent.left = current.left;
			else if(parent.right==current) parent.right = current.left;
			return current;
		}
		else{
			BinarySearchTreeNode nextMaximum = nextMaximumNode(current);
			int tempData = current.data;
			current.data = nextMaximum.data;
			nextMaximum.data = tempData;
			return deleteBinarySearchTreeNodeUtil(current, tempData);
		}
	}

	private BinarySearchTreeNode nextMaximumNode(BinarySearchTreeNode node){
		BinarySearchTreeNode next = node.right;
		while(next !=null && next.left!=null){
			next=next.left;
		}
		return next;
	}

	public BinarySearchTreeNode deleteBinarySearchTreeNodeUsingRecursion(int data) {
        return deleteBinarySearchTreeNodeUsingRecursionUtil(this.root, data);
    }

    private BinarySearchTreeNode deleteBinarySearchTreeNodeUsingRecursionUtil(BinarySearchTreeNode node, int data) {
        if (node == null) return null;

        if (data < node.data) {
            node.left = deleteBinarySearchTreeNodeUsingRecursionUtil(node.left, data);
        } else if (data > node.data) {
            node.right = deleteBinarySearchTreeNodeUsingRecursionUtil(node.right, data);
        } else {
            // Node to be deleted found
            if (node.left == null && node.right == null) {
                return null; // Leaf node
            } else if (node.left == null) {
                return node.right; // Single right child
            } else if (node.right == null) {
                return node.left; // Single left child
            } else {
                // Node with two children
                BinarySearchTreeNode nextMaximum = nextMaximumNode(node);
                int tempData = nextMaximum.data;
                node.right = deleteBinarySearchTreeNodeUsingRecursionUtil(node.right, tempData); // Delete in-order successor
                node.data = tempData;
            }
        }
        return node;
    }
}
