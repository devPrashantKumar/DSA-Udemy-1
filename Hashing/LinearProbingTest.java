package Hashing;

public class LinearProbingTest {
    public static void main(String[] args) {
        LinearProbing lb = new LinearProbing(10);

        lb.insertElement("Hello");
        lb.insertElement("World");
        lb.insertElement("abc");
        lb.insertElement("good");
        lb.printHashTable();
        System.out.println("---------------------------------------------------");
        System.out.println("element exists : "+lb.searchElement("klm"));
        System.out.println("element exists : "+lb.searchElement("World"));
        System.out.println("element deleted : "+lb.deleteElement("def"));
        System.out.println("element deleted : "+lb.deleteElement("World"));
        System.out.println("element exists : "+lb.searchElement("World"));
        System.out.println("---------------------------------------------------");
        lb.printHashTable();
        System.out.println("---------------------------------------------------");
        lb.insertElement("Hello1");
        lb.insertElement("Hello2");
        lb.insertElement("Hello3");
        lb.insertElement("Hello4");
        lb.insertElement("Hello5");
        lb.insertElement("Hello6");
        lb.insertElement("Hello7");
        lb.insertElement("Hello8");
        lb.insertElement("Hello9");
        lb.insertElement("Hello10");
        lb.printHashTable();
        System.out.println("---------------------------------------------------");


    }
}
