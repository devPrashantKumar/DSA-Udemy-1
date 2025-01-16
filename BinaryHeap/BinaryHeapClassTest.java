package BinaryHeap;

public class BinaryHeapClassTest {
    public static void main(String[] args) {
        BinaryHeapClass bh = new BinaryHeapClass(5);
        bh.insertElementInHeap(25);
        bh.insertElementInHeap(14);
        bh.insertElementInHeap(3);
        bh.insertElementInHeap(18);
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
