package DataStructures.Stack;

public class StackUsingLinkedList {
    class StackNode {
        int value;
        StackNode next;

        public StackNode(int value) {
            this.value = value;
        }

        public StackNode(int value, StackNode next) {
            this.value = value;
            this.next = next;
        }
    }

    StackNode head;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int value) {
        head = new StackNode(value, head);
    }

    public int pop() throws StackSpaceException {
        if (isEmpty()) {
            throw new StackSpaceException("Stack is Empty");
        }
        StackNode popedStackNode = head;
        head = head.next;
        return popedStackNode.value;
    }

    public int peek() throws StackSpaceException {
        if (isEmpty()) {
            throw new StackSpaceException("Stack is Empty");
        }
        return head.value;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        StackNode current = head;
        sb.append("[");
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
