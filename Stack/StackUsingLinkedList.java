package Stack;

public class StackUsingLinkedList {
    class StackNode {
        int value;
        StackNode next;
    
        public StackNode(int value){
            this.value = value;
        }
        public StackNode(int value, StackNode next){
            this.value = value;
            this.next = next;
        }
    }

    StackNode head;

    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }

    public void push(int value){
        StackNode newStackNode = new StackNode(value);
        newStackNode.next = head;
        head = newStackNode;
    }

    public int pop() throws StackSpaceException{
        if(isEmpty()){
            throw new StackSpaceException("Stack is Empty");
        }
        else{
            StackNode popedStackNode = head;
            head = head.next;
            return popedStackNode.value;
        }
    }

    public int peek() throws StackSpaceException{
        if(isEmpty()){
            throw new StackSpaceException("Stack is Empty");
        }
        else{
            return head.value;
        }
    }
}
