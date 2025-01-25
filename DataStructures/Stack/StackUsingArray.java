package DataStructures.Stack;

public class StackUsingArray {
    private int[] arr;
    private int topOfStack;

    public StackUsingArray(int size) {
        this.arr = new int[size];
        topOfStack = -1;
    }

    public boolean isEmpty() {
        return topOfStack == -1;
    }

    public boolean isFull() {
        return topOfStack == arr.length - 1;
    }

    public void push(int value) throws StackSpaceException {
        if (isFull()) {
            throw new StackSpaceException("Stack is Full");
        }
        this.arr[++topOfStack] = value;
    }

    public int pop() throws StackSpaceException {
        if (isEmpty()) {
            throw new StackSpaceException("Stack is Empty");
        }
        return this.arr[topOfStack--];
    }

    public int peek() throws StackSpaceException {
        if (isEmpty()) {
            throw new StackSpaceException("Stack is Empty");
        }
        return this.arr[topOfStack];
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= topOfStack; i++) {
            sb.append(arr[i]);
            if (i < topOfStack) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
