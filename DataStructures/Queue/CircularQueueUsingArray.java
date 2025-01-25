package DataStructures.Queue;

public class CircularQueueUsingArray {
    private int[] arr;
    private int beginningOfQueue;
    private int endOfQueue;

    public CircularQueueUsingArray(int size){
        this.arr = new int[size];
        beginningOfQueue=-1;
        endOfQueue=-1;
    }

    public boolean isEmpty(){
        return beginningOfQueue==-1;
    }

    public boolean isFull(){
        return ((endOfQueue+1)%this.arr.length)==beginningOfQueue;
    }

    public void enqueue(int value){
        if(isFull()){
            throw new QueueSpaceException("Queue is Full");
        }
        if(isEmpty()){
            beginningOfQueue=0;
        }
        endOfQueue = (endOfQueue+1)%this.arr.length;
        this.arr[endOfQueue]=value;
    }

    public int dequeue(){
        if(isEmpty()){
            throw new QueueSpaceException("Queue is Empty");
        }
        int value = this.arr[beginningOfQueue];
        if(beginningOfQueue==endOfQueue){
            beginningOfQueue=-1;
            endOfQueue=-1;
        }
        else{
            beginningOfQueue = (beginningOfQueue+1)%this.arr.length;
        }
        return value;
    }

    public int peek(){
        if(isEmpty()){
            throw new QueueSpaceException("Queue is Empty");
        }
        return this.arr[beginningOfQueue];
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = beginningOfQueue;
        while (true) {
            sb.append(arr[i]);
            if (i == endOfQueue) {
                break;
            }
            i = (i + 1) % arr.length;
            sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
