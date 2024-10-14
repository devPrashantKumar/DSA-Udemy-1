package BinarySearchTree;

public class BinarySearchTreeClassTest {
	public static void main(String[] args) {
		BinarySearchTreeClass bst = new BinarySearchTreeClass();
		bst.root = bst.insertBinarySearchTreeNode(bst.root, 10);
		bst.root = bst.insertBinarySearchTreeNode(bst.root, 11);
		bst.root = bst.insertBinarySearchTreeNode(bst.root, 12);
		bst.root = bst.insertBinarySearchTreeNode(bst.root, 14);
		bst.root = bst.insertBinarySearchTreeNode(bst.root, 5);
		bst.root = bst.insertBinarySearchTreeNode(bst.root, 0);
		bst.root = bst.insertBinarySearchTreeNode(bst.root, 7);
		

		BinarySearchTreeClass bst1 = new BinarySearchTreeClass();
		bst1.insertBinarySearchTreeNode2(10);
		bst1.insertBinarySearchTreeNode2(11);
		bst1.insertBinarySearchTreeNode2(12);
		bst1.insertBinarySearchTreeNode2(14);
		bst1.insertBinarySearchTreeNode2(5);
		bst1.insertBinarySearchTreeNode2(0);
		bst1.insertBinarySearchTreeNode2(7);


		bst.printInorderTraversal(bst.root);
		System.out.println();
		bst1.printInorderTraversal(bst1.root);
		System.out.println();
		System.out.println("---------------------------------------------");
		bst.printpreOrderTraversal(bst.root);
		System.out.println();
		bst1.printpreOrderTraversal(bst1.root);
		System.out.println();
		System.out.println("---------------------------------------------");
		bst.printpostOrderTraversal(bst.root);
		System.out.println();
		bst1.printpostOrderTraversal(bst1.root);
		System.out.println();
		System.out.println("---------------------------------------------");


		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");

		BinarySearchTreeNode deletedNode = bst.deleteBinarySearchTreeNode(bst.root, 5);
		System.out.println("node deleted : "+deletedNode.data);
	}
}
