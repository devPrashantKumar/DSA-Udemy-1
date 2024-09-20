package Queue;

public class QueueUsingLinkedListTest {
    public static void main(String[] args) {
        QueueUsingLinkedList queueUsingLinkedList = new QueueUsingLinkedList();
        System.out.println("Queue is Empty : " + queueUsingLinkedList.isEmpty());
        queueUsingLinkedList.enqueue(0);
        System.out.println("Queue is Empty : " + queueUsingLinkedList.isEmpty());
        queueUsingLinkedList.enqueue(1);
        queueUsingLinkedList.enqueue(2);

        System.out.println("element peeked : " + queueUsingLinkedList.peek());
        System.out.println("element dequeued : " + queueUsingLinkedList.dequeue());
        System.out.println("element peeked : " + queueUsingLinkedList.peek());
        System.out.println("element dequeued : " + queueUsingLinkedList.dequeue());
        System.out.println("element peeked : " + queueUsingLinkedList.peek());
        System.out.println("element dequeued : " + queueUsingLinkedList.dequeue());

        try {
            System.out.println("element peeked : " + queueUsingLinkedList.peek());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println("element dequeued : " + queueUsingLinkedList.dequeue());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
