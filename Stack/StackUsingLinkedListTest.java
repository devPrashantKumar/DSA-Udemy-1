package Stack;

public class StackUsingLinkedListTest {
    public static void main(String[] args) {
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        System.out.println("Stack is Empty : "+stackUsingLinkedList.isEmpty());
        stackUsingLinkedList.push(0);
        stackUsingLinkedList.push(1);
        stackUsingLinkedList.push(2);

        System.out.println("Element Peeked : "+stackUsingLinkedList.peek());
        System.out.println("Element Poped : "+stackUsingLinkedList.pop());
        System.out.println("Element Peeked : "+stackUsingLinkedList.peek());
        System.out.println("Element Poped : "+stackUsingLinkedList.pop());
        System.out.println("Element Peeked : "+stackUsingLinkedList.peek());
        System.out.println("Element Poped : "+stackUsingLinkedList.pop());

        try {
            System.out.println("Element Poped : "+stackUsingLinkedList.pop());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println("Element Peeked : "+stackUsingLinkedList.peek()); 
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
