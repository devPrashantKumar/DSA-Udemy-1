package Sorting.SelectionSort;
import java.util.Arrays;

public class SelectionSortClassTest {
    public static void main(String[] args) {
        int[] arr = {2,3,1,7,3,9,6};
        SelectionSortClass.SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {4, 5, 3, 5, 1};
        SelectionSortClass.SelectionSortStable(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
