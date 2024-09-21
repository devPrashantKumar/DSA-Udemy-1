package LinkedList.SinglyLinkedList;

public class SingleLinkedListOptimizeTest {
    public static void main(String[] args) {
        SingleLinkedListOptimize singleLinkedListOptimize = new SingleLinkedListOptimize();
        try {
            singleLinkedListOptimize.insertNodeInLinkedList(1, 1);
        } catch (Exception e) {
            System.out.println(e);
        }
        singleLinkedListOptimize.insertNodeInLinkedList(0, 0);
        singleLinkedListOptimize.insertNodeInLinkedList(1, 0);
        singleLinkedListOptimize.insertNodeInLinkedList(2, 2);
        singleLinkedListOptimize.insertNodeInLinkedList(3, 2);
        singleLinkedListOptimize.traverseLinkedList();
        singleLinkedListOptimize.deleteNodeInLinkedList(2);
        singleLinkedListOptimize.traverseLinkedList();
        singleLinkedListOptimize.deleteNodeInLinkedList(0);
        singleLinkedListOptimize.traverseLinkedList();
        singleLinkedListOptimize.deleteNodeInLinkedList(1);
        singleLinkedListOptimize.traverseLinkedList();
        singleLinkedListOptimize.deleteNodeInLinkedList(0);
        singleLinkedListOptimize.traverseLinkedList();
    }
}
