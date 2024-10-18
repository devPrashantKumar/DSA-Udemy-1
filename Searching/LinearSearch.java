package Searching;

public class LinearSearch {
    /*
     * Time Complexity - O(n)
     * Space Complexity - O(1)
     */
    public static Integer linearSearch(Integer[] arr, Integer data){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(data)){
                return arr[i];
            }
        }
        return null;
    }
}
