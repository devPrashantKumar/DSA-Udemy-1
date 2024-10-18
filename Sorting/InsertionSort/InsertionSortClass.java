package Sorting.InsertionSort;

public class InsertionSortClass {
    public static int[] InsertionSort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int element = arr[i];
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j]>element){
                    arr[j+1]=arr[j];
                }else{
                    arr[j+1]=element;
                    break;
                }
            }
            if(j==-1){
                arr[0]=element;  
            }
        }
        return arr;
    }
}
