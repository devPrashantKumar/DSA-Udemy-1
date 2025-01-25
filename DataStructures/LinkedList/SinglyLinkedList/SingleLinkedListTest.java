package DataStructures.LinkedList.SinglyLinkedList;

public class SingleLinkedListTest {
    public static void main(String[] args) {
        SingleLinkedList sLL = new SingleLinkedList();
        sLL.insertElement(0,10); 
        sLL.traverseLinkedList();
        sLL.insertElement(1,11); 
        sLL.insertElement(2,12); 
        sLL.traverseLinkedList();
        sLL.insertElement(1,13); 
        sLL.traverseLinkedList();
        Integer nodeValue =sLL.searchLinkedList(10);
        if(nodeValue!=null){
            System.out.println("Node Found : "+nodeValue);
        }
        Integer nodeValue2 = sLL.searchLinkedList(15);
        if(nodeValue2==null){
            System.out.println("Node Not Found : "+nodeValue2);
        }
        sLL.traverseLinkedList();
        sLL.deleteLinkedList();
        sLL.traverseLinkedList();

    }
}
