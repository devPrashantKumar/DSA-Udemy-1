package DataStructures.Queue;

public class QueueUsingLinkedList {
    class QueueNode{
        int value;
        QueueNode next;

        public QueueNode(int value){
            this.value = value;
        }
    }

    QueueNode head;
    QueueNode tail;

    public boolean isEmpty(){
        return head==null;
    }

    public void enqueue(int value){
        QueueNode newQueueNode = new QueueNode(value);
        if(isEmpty()){
            head = tail = newQueueNode;
        }
        else{
            tail.next = newQueueNode;
            tail = tail.next;
        } 
    }

    public int dequeue(){
        if(isEmpty()){
            throw new QueueSpaceException("Queue is Empty");
        }
        QueueNode queueNode = head;
        head = head.next;
        if(isEmpty()) tail = null;
        return queueNode.value;
    }

    public int peek(){
        if(isEmpty()){
            throw new QueueSpaceException("Queue is Empty");
        }
        return head.value;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        QueueNode current = head;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
