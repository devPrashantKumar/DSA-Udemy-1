package BinaryHeap;

public class BinaryHeapClassTest {
    public static void main(String[] args) {
        BinaryHeapClass bh = new BinaryHeapClass(20);
        bh.insertElementInHeap(25,"minHeap");
        bh.insertElementInHeap(14, "minHeap");
        bh.insertElementInHeap(3, "minHeap");
        bh.insertElementInHeap(18, "minHeap");
        bh.printLevelOrderTraversal();
    }
    

}
