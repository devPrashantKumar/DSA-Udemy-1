package BinaryHeap;

public class BinaryHeapClassTest {
    public static void main(String[] args) {
        BinaryHeapClass bh = new BinaryHeapClass(20);
        bh.insertElementInHeap(25);
        bh.insertElementInHeap(14);
        bh.insertElementInHeap(3);
        bh.insertElementInHeap(18);
        bh.printLevelOrderTraversal();
    }
    

}
