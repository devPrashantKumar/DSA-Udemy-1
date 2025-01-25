package Algorithms.Recursion;

public class MaxElementInArrayUsingRecursion {
    public static void main(String[] args) {

        System.out.println("Max element is : "+new MaxElementInArrayUsingRecursion().findMax2(new int[]{1,3,2,5,4},5));
        System.out.println("Max element is : "+MaxElementInArrayUsingRecursion.findMax1(new int[]{1,3,2,5,4},5));

    }

    public static int findMax1(int[] array, int n){
        if(n==1){
            return array[0];
        }
        return Math.max(array[n-1],findMax1(array, n-1));
    }

    public int findMax2(int[] array, int n){
        if(n==1){
            return array[0];
        }
        return Math.max(array[n-1],findMax2(array, n-1));
    }
}
