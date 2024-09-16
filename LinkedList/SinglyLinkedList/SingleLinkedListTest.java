package LinkedList.SinglyLinkedList;

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
        Node nodeLoc1 =sLL.searchLinkedList(10);
        if(nodeLoc1!=null){
            System.out.println("Node Found : "+nodeLoc1.value);
        }
        Node nodeLoc2 = sLL.searchLinkedList(15);
        if(nodeLoc2==null){
            System.out.println("Node Not Found");
        }
        sLL.traverseLinkedList();
        sLL.deleteLinkedList();
        sLL.traverseLinkedList();

    }
    
}
