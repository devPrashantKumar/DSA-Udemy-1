package Hashing;

public class DoubleHashingTest {
    public static void main(String[] args) {
        DoubleHashing doubleHashing = new DoubleHashing(7);

        doubleHashing.insertElement("Apple");
        doubleHashing.insertElement("Banana");
        doubleHashing.insertElement("Cherry");
        doubleHashing.insertElement("Dates");
        doubleHashing.insertElement("Elderberry");

        System.out.println("Hash Table:");
        doubleHashing.printHashTable();

        System.out.println("\nSearching for 'Banana': " + doubleHashing.searchElement("Banana"));
        System.out.println("Deleting 'Cherry': " + doubleHashing.deleteElement("Cherry"));
        System.out.println("\nHash Table after deletion:");
        doubleHashing.printHashTable();
    }
}
