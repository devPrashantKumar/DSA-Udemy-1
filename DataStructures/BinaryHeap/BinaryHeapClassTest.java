package DataStructures.BinaryHeap;

public class BinaryHeapClassTest {
    public static void main(String[] args) {
        BinaryHeapClass bh = new BinaryHeapClass(10, new int[]{25,14});
        bh.insertElementInHeap(25);
        bh.insertElementInHeap(14);
        bh.insertElementInHeap(3);
        bh.insertElementInHeap(18);
        bh.insertElementInHeap(10);
        bh.printLevelOrderTraversal();

        System.out.println(bh.removeMinElement());
        bh.printLevelOrderTraversal();

        System.out.println(bh.removeMinElement());
        bh.printLevelOrderTraversal();

        System.out.println(bh.removeMinElement());
        bh.printLevelOrderTraversal();

        System.out.println(bh.removeMinElement());
        bh.printLevelOrderTraversal();
        
        System.out.println(bh.removeMinElement());

    }
    

}
