package Searching;

public class BinarySearch {
    
    public static Integer binarySearchUsingRecursion(Integer[] arr, Integer data){
        return binarySearchUtilForRecursion(arr,data,0,arr.length-1);
    }

    public static Integer binarySearchUsingIteration(Integer[] arr, Integer data){
        return binarySearchUtilForIteration(arr,data,0,arr.length-1);
    }

    public static Integer binarySearchUtilForRecursion(Integer[] arr, Integer data, int start, int end){
        if(start>end) return null;
        int mid = start+((end-start)/2);
        if(arr[mid]==data) return arr[mid];
        else if(arr[mid]>data) return binarySearchUtilForRecursion(arr, data, start, mid-1);
        else return binarySearchUtilForRecursion(arr, data, mid+1, end);
    }

    public static Integer binarySearchUtilForIteration(Integer[] arr, Integer data, int start, int end){
        while(start<=end){
            int mid = start+((end-start)/2);
            if(arr[mid]==data) return arr[mid];
            else if(arr[mid]>data) end = mid-1;
            else start = mid+1;
        }
        return null;
    }
}
