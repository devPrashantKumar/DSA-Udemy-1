package Tree;

public class TreeTempTest {
    public static void main(String[] args) {
        TreeTemp tree = new TreeTemp();
        tree.createTree(10);
        tree.addChild(12);
        tree.addChild(15);
        tree.addChild(16);
        tree.addChild(17);
        tree.printTree(tree.root, 0);
    }
}
