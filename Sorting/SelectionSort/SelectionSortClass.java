package Sorting.SelectionSort;

public class SelectionSortClass {
    /*  NOT CORRECT SELECTION SORT
     * Time Complexity O(n^2)
     * Space Complexity O(1)
     * In-Place Algorithm
     * Unstable (due to swapping)
    public static int[] SelectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    */


    /*  CORRECT SELECTION SORT
     * Time Complexity O(n^2)
     * Space Complexity O(1)
     * In-Place Algorithm
     * Unstable (due to swapping)
     */
    public static int[] SelectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(i!=minIndex){
                int temp= arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
            }
        }
        return arr;
    }

    /*  CORRECT STABLE SELECTION SORT
     * Time Complexity O(n^2)
     * Space Complexity O(1)
     * In-Place Algorithm
     * stable (due to shifting)
     */
    public static int[] SelectionSortStable(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(i!=minIndex){
                int minimum = arr[minIndex];
                for(int j=minIndex-1;j>=i;j--){
                    arr[j+1]=arr[j];
                }
                arr[i]=minimum;
            }
        }
        return arr;
    }
}
