package Arrays;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][2];
        System.out.println(Arrays.deepToString(arr1));

        // this code is fine 
        int[][] arr2;
        arr2 = new int[2][];
        arr2[0] = new int[2];
        arr2[1] = new int[5];
        System.out.println(Arrays.deepToString(arr2));
    }
}