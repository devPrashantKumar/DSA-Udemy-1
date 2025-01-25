package DataStructures.Arrays;

import java.util.Arrays;

public class OneDArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));

        //System.out.println(Arrays.deepToString(arr1)); it will not work


        int[] arr3;
        //arr3 = {1,2,3,4,5}; // wrong , Array constants can only be used in initializers only can be used during declaration
        arr3 = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr3));

        int [] arr4 = new int[0];
        System.out.println(Arrays.toString(arr4));
    }
}