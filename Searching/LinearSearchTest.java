package Searching;

public class LinearSearchTest {
    public static void main(String[] args) {
        Integer[] arr = {1,5,2,9,4,7,3};
        System.out.println("Element found 3 - "+LinearSearch.linearSearch(arr, 3));
        System.out.println("Element found 13 - "+LinearSearch.linearSearch(arr, 13));
    }
}
