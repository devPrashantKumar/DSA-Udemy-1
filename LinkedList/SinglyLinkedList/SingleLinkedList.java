package LinkedList.SinglyLinkedList;

public class SingleLinkedList {
    Node head;
    Node tail;
    int size;

    public void insertElement(int location, int value) {
        Node newNode = new Node(value, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else if (location == 0) {
            newNode.next = head;
            head = newNode;
        } else if (location >= size) {
            tail.next = newNode;
            tail = tail.next;
        } else {
            Node current = head;
            for (int i = 1; i < location; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    public void traverseLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public Node searchLinkedList(int value) {
        Node current = head;
        while (current != null) {
            if(value==current.value){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void deleteLinkedList(){
        head=null;
        tail=null;
    }

    public void deleteNodeInLinkedList(int location){
        if(head==null){
            return;
        }
        else if(head==tail){
            head=null;
            tail=null;
        }
        else if(location==0){
            head = head.next;
        }
        else{
            Node prev = head;
            for(int i=0;i<location-1;i++){
                prev = prev.next;
            }
            prev.next = prev.next.next;
        }
    }
}
