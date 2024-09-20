package Queue;

public class LinearQueueUsingArray {
    private int[] arr;
    private int beginningOfQueue;
    private int endOfQueue;

    public LinearQueueUsingArray(int size) {
        this.arr = new int[size];
        this.beginningOfQueue = -1;
        this.endOfQueue = -1;
    }

    public boolean isEmpty() {
        return beginningOfQueue == -1;
    }

    public boolean isFull() {
        return endOfQueue == this.arr.length - 1;
    }

    public void enqueue(int value) throws QueueSpaceException {
        if (isFull()) {
            throw new QueueSpaceException("Queue is full");
        }
        if(isEmpty()){
            beginningOfQueue=0;
        }
        this.arr[++endOfQueue] = value;
    }

    public int dequeue() throws QueueSpaceException {
        if (isEmpty()) {
            throw new QueueSpaceException("Stack is Empty");
        }
        int value = this.arr[beginningOfQueue++];
        if (beginningOfQueue > endOfQueue) {
            beginningOfQueue = endOfQueue = -1;
        }
        return value;
    }

    public int peek() throws QueueSpaceException {
        if (isEmpty()) {
            throw new QueueSpaceException("Stack is Empty");
        }
        return this.arr[beginningOfQueue];
    }

}
