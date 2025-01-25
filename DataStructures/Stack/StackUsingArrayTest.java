package DataStructures.Stack;

public class StackUsingArrayTest {
    public static void main(String[] args){
        StackUsingArray stackUsingArray = new StackUsingArray(3);
        System.out.println("Stack is Empty : " + stackUsingArray.isEmpty());
        System.out.println("Stack is Full : " + stackUsingArray.isFull());

        stackUsingArray.push(0);
        stackUsingArray.push(1);
        stackUsingArray.push(2);
        try {
            stackUsingArray.push(3);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Stack is Empty : " + stackUsingArray.isEmpty());
        System.out.println("Stack is Full : " + stackUsingArray.isFull());

        System.out.println("Element Peeked : "+stackUsingArray.peek());
        System.out.println("Element Poped : "+stackUsingArray.pop());
        System.out.println("Element Peeked : "+stackUsingArray.peek());
        System.out.println("Element Poped : "+stackUsingArray.pop());
        System.out.println("Element Peeked : "+stackUsingArray.peek());
        System.out.println("Element Poped : "+stackUsingArray.pop());

        try {
            System.out.println("Element Poped : "+stackUsingArray.pop());

        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println("Element Peeked : "+stackUsingArray.peek());

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Stack is Empty : " + stackUsingArray.isEmpty());
        System.out.println("Stack is Full : " + stackUsingArray.isFull());
    }

}
