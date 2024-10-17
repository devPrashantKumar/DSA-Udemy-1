package Hashing;

public class QuadraticProbingTest {
    public static void main(String[] args) {
        QuadraticProbing qp = new QuadraticProbing(10);

        qp.insertElement("Hello");
        qp.insertElement("World");
        qp.insertElement("abc");
        qp.insertElement("good");
        qp.printHashTable();
        System.out.println("---------------------------------------------------");
        System.out.println("element exists : "+qp.searchElement("klm"));
        System.out.println("element exists : "+qp.searchElement("World"));
        System.out.println("element deleted : "+qp.deleteElement("def"));
        System.out.println("element deleted : "+qp.deleteElement("World"));
        System.out.println("element exists : "+qp.searchElement("World"));
        System.out.println("---------------------------------------------------");
        qp.printHashTable();
        System.out.println("---------------------------------------------------");
        qp.insertElement("Hello1");
        qp.insertElement("Hello2");
        qp.insertElement("Hello3");
        qp.insertElement("Hello4");
        qp.insertElement("Hello5");
        qp.insertElement("Hello6");
        qp.insertElement("Hello7");
        qp.insertElement("Hello8");
        qp.insertElement("Hello9");
        qp.insertElement("Hello10");
        qp.printHashTable();
        System.out.println("---------------------------------------------------");


    }
}

