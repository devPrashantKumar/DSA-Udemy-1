package Hashing;

public class LinearProbingTest {
    public static void main(String[] args) {
        LinearProbing lp = new LinearProbing(10);

        lp.insertElement("Hello");
        lp.insertElement("World");
        lp.insertElement("abc");
        lp.insertElement("good");
        lp.printHashTable();
        System.out.println("---------------------------------------------------");
        System.out.println("element exists : "+lp.searchElement("klm"));
        System.out.println("element exists : "+lp.searchElement("World"));
        System.out.println("element deleted : "+lp.deleteElement("def"));
        System.out.println("element deleted : "+lp.deleteElement("World"));
        System.out.println("element exists : "+lp.searchElement("World"));
        System.out.println("---------------------------------------------------");
        lp.printHashTable();
        System.out.println("---------------------------------------------------");
        lp.insertElement("Hello1");
        lp.insertElement("Hello2");
        lp.insertElement("Hello3");
        lp.insertElement("Hello4");
        lp.insertElement("Hello5");
        lp.insertElement("Hello6");
        lp.insertElement("Hello7");
        lp.insertElement("Hello8");
        lp.insertElement("Hello9");
        lp.insertElement("Hello10");
        lp.printHashTable();
        System.out.println("---------------------------------------------------");


    }
}
