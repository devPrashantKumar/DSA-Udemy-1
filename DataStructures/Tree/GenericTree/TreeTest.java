package DataStructures.Tree.GenericTree;

public class TreeTest {
    public static void main(String[] args) {
        Tree tree = new Tree();

        // Create the root
        tree.createRoot(1);

        // Add children to the root
        Tree.TreeNode root = tree.getRoot();
        root.addChild(2);
        root.addChild(3);

        // Add children to one of the root's children
        Tree.TreeNode child1 = root.getChild(0); // Node with data 2
        child1.addChild(4);
        child1.addChild(5);

        // Add children to another root's child
        Tree.TreeNode child2 = root.getChild(1); // Node with data 3
        child2.addChild(6);

        // Print the tree
        tree.printTree();
    }
}
