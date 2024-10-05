package Tree.BinaryTree.BinaryTreeArray;

public class BinaryTreeArrayClassTest {
    public static void main(String[] args) {
        BinaryTreeArrayClass binaryTreeArrayClass = new BinaryTreeArrayClass(10);
        binaryTreeArrayClass.insertNode(10);
        binaryTreeArrayClass.insertNode(11);
        binaryTreeArrayClass.insertNode(12);
        binaryTreeArrayClass.insertNode(13);
        binaryTreeArrayClass.insertNode(14);
        binaryTreeArrayClass.insertNode(15);
        binaryTreeArrayClass.insertNode(16);
        binaryTreeArrayClass.insertNode(17);
        binaryTreeArrayClass.insertNode(18);
        binaryTreeArrayClass.insertNode(19);
        binaryTreeArrayClass.preOrderTraversal(1);
        System.out.println();
        binaryTreeArrayClass.inOrderTraversal(1);
        System.out.println();
        binaryTreeArrayClass.postOrderTraversal(1);
        System.out.println();
        binaryTreeArrayClass.levelOrderTraversal();
        System.out.println();
        binaryTreeArrayClass.insertNode(20);
        System.out.println("20 is available : " + binaryTreeArrayClass.searchNode(20));
        System.out.println("15 is available : " + binaryTreeArrayClass.searchNode(15));

        binaryTreeArrayClass.deleteNode(15);
        binaryTreeArrayClass.levelOrderTraversal();
        System.out.println();
        binaryTreeArrayClass.deleteNode(18);
        binaryTreeArrayClass.levelOrderTraversal();
        System.out.println();

    }

}
