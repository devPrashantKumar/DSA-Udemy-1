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

        int[][] arr3;
        arr3 = new int[2][];
        //arr3[0] = {1,2,3,4,5};  wrong , Array constants can only be used in initializers only can be used during declaration
        arr3[0] = new int[]{1,2,3,4,5};
        arr3[1] = new int[5];
        System.out.println(Arrays.deepToString(arr3));

        int[][] arr6;
       //  arr3 =  {{1,2,3,4},{5,6,7,8}};  wrong , Array constants can only be used in initializers only can be used during declaration
       arr6 = new int[][]{{1,2,3,4},{5,6,7,8}};
       System.out.println(Arrays.deepToString(arr6));


        // both type of declaration and initalization will work.
        int[][] arr4 = new int[][]{{1,2,3,4},{5,6,7,8}};
        int[][] arr5 = {{1,2,3,4},{5,6,7,8}};
        System.out.println(Arrays.deepToString(arr4));
        System.out.println(Arrays.deepToString(arr5));

    }
}