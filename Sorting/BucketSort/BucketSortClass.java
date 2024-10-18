package Sorting.BucketSort;
import java.util.*;

public class BucketSortClass {
    /*Time Complexity:
     * Best Case: O(n) (when elements are uniformly distributed across buckets)
     * Average Case: O(n + n log n)
     * Worst Case: O(n^2) (when all elements fall into the same bucket)
     * Space Complexity:
     * Worst Case: O(n + k), where k is the number of buckets and n is the number of elements.    
     * Out-of-Place Algorithm
     * Stable Algorithm
     */
    public static int[] bucketSort(int[] arr){
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numberOfBuckets; i++) {
            list.add(new ArrayList<>());
        }
        int maxElement = Arrays.stream(arr).max().orElse(0);
        for(int num:arr){
            int bucket = (int) Math.ceil(((float) num*numberOfBuckets)/maxElement);
            list.get(bucket-1).add(num);
        }

        for (List<Integer> bucket : list) {
            Collections.sort(bucket);
        }
        
        int index = 0;
        for (List<Integer> bucket : list) {
            for (int num : bucket) {
                arr[index++] = num;
            }
        }
        return arr;
    }
}
