package Queue;

public class CircularQueueUsingArrayTest {
    public static void main(String[] args) {
        CircularQueueUsingArray circularQueueUsingArray = new CircularQueueUsingArray(3);
        System.out.println("Queue is Empty : "+circularQueueUsingArray.isEmpty());
        System.out.println("Queue is Full : "+circularQueueUsingArray.isFull());

        circularQueueUsingArray.enqueue(0);
        circularQueueUsingArray.enqueue(1);
        circularQueueUsingArray.enqueue(2);
        try {
            circularQueueUsingArray.enqueue(3);

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Queue is Empty : "+circularQueueUsingArray.isEmpty());
        System.out.println("Queue is Full : "+circularQueueUsingArray.isFull());

        System.out.println("Element peeked : "+circularQueueUsingArray.peek());
        System.out.println("Element dequed : "+circularQueueUsingArray.dequeue());
        System.out.println("Queue is Empty : "+circularQueueUsingArray.isEmpty());
        System.out.println("Queue is Full : "+circularQueueUsingArray.isFull());
        circularQueueUsingArray.enqueue(0);
        System.out.println("Queue is Empty : "+circularQueueUsingArray.isEmpty());
        System.out.println("Queue is Full : "+circularQueueUsingArray.isFull());
        
        System.out.println("Element peeked : "+circularQueueUsingArray.peek());
        System.out.println("Element dequed : "+circularQueueUsingArray.dequeue());
        System.out.println("Element peeked : "+circularQueueUsingArray.peek());
        System.out.println("Element dequed : "+circularQueueUsingArray.dequeue());
        System.out.println("Element peeked : "+circularQueueUsingArray.peek());
        System.out.println("Element dequed : "+circularQueueUsingArray.dequeue());
        try {
            System.out.println("Element peeked : "+circularQueueUsingArray.peek());
        } catch (Exception e) {
            System.out.println(e);;
        }

        try {
            System.out.println("Element dequed : "+circularQueueUsingArray.dequeue());
        } catch (Exception e) {
            System.out.println(e);;
        }


    }
}
