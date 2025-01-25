package DataStructures.Queue;

public class LinearQueueUsingArrayTest {
    public static void main(String[] args) {
        LinearQueueUsingArray linearQueueUsingArray = new LinearQueueUsingArray(3);
        System.out.println("Queue is Empty : "+linearQueueUsingArray.isEmpty());
        System.out.println("Queue is Full : "+linearQueueUsingArray.isFull());

        linearQueueUsingArray.enqueue(0);
        linearQueueUsingArray.enqueue(1);
        linearQueueUsingArray.enqueue(2);

        System.out.println("Queue is Empty : "+linearQueueUsingArray.isEmpty());
        System.out.println("Queue is Full : "+linearQueueUsingArray.isFull());

        try {
            linearQueueUsingArray.enqueue(3);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.err.println("element peeked : "+linearQueueUsingArray.peek());
        System.err.println("element dequeued : "+linearQueueUsingArray.dequeue());
        System.err.println("element peeked : "+linearQueueUsingArray.peek());
        System.err.println("element dequeued : "+linearQueueUsingArray.dequeue());
        System.err.println("element peeked : "+linearQueueUsingArray.peek());
        System.err.println("element dequeued : "+linearQueueUsingArray.dequeue());

        try {
            System.err.println("element dequeued : "+linearQueueUsingArray.dequeue());
        } catch (Exception e) {
            System.out.println(e);
        }try {
            System.err.println("element peeked : "+linearQueueUsingArray.peek());
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Queue is Empty : "+linearQueueUsingArray.isEmpty());
        System.out.println("Queue is Full : "+linearQueueUsingArray.isFull());
        linearQueueUsingArray.enqueue(0);
        System.err.println("element peeked : "+linearQueueUsingArray.peek());
        System.err.println("element dequeued : "+linearQueueUsingArray.dequeue());
        System.out.println("Queue is Empty : "+linearQueueUsingArray.isEmpty());
        System.out.println("Queue is Full : "+linearQueueUsingArray.isFull());
    }
}
