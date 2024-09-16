package LinkedList.CircularSinglyLinkedList;

public class CircularSingleLinkedListTest {
    public static void main(String[] args) {
        CircularSingleLinkedList circularSingleLinkedList = new CircularSingleLinkedList();
        circularSingleLinkedList.insertElement(10, 0);
        circularSingleLinkedList.traveseCircularSingleLinkedList();
        circularSingleLinkedList.insertElement(11,1);
        circularSingleLinkedList.traveseCircularSingleLinkedList();
        circularSingleLinkedList.insertElement(12,0);
        circularSingleLinkedList.traveseCircularSingleLinkedList();
        circularSingleLinkedList.insertElement(13,3);
        circularSingleLinkedList.traveseCircularSingleLinkedList();
        circularSingleLinkedList.insertElement(14,2);
        circularSingleLinkedList.traveseCircularSingleLinkedList();
        circularSingleLinkedList.traveseUsingTailCircularSingleLinkedList();
    }
}
