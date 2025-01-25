package DataStructures.Hashing;

public class DirectChainingTest {
    public static void main(String[] args) {
        DirectChaining dc = new DirectChaining(10);
        dc.insertElement("Hello");
        dc.insertElement("World");
        dc.insertElement("abc");
        dc.insertElement("good");
        dc.printHashTable();
        System.out.println("---------------------------------------------------");
        System.out.println("element exists : "+dc.searchElement("klm"));
        System.out.println("element exists : "+dc.searchElement("World"));
        System.out.println("element deleted : "+dc.deleteElement("def"));
        System.out.println("element deleted : "+dc.deleteElement("World"));
        System.out.println("element exists : "+dc.searchElement("World"));
        System.out.println("---------------------------------------------------");
        dc.printHashTable();






    }
}
