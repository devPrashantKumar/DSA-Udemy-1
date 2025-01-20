package Tree.GenericTree;

public class TreeNodeTest {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(11);
        TreeNode node3 = new TreeNode(12);
        TreeNode node4 = new TreeNode(13);
        TreeNode node5 = new TreeNode(14);
        TreeNode node6 = new TreeNode(15);

        TreeNode root = node1;
        
        node1.addChild(node2);
        node1.addChild(node3);
        node2.addChild(node4);
        node3.addChild(node5);
        node5.addChild(node6);
        root.printTree(0);
    }
}
