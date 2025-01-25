package DataStructures.ArrayList;
import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList2.add(1);
        arrayList2.add(2);
        System.out.println(arrayList2);
        arrayList2.add(1,3);
        System.out.println(arrayList2);
        arrayList2.add(3,4);
        System.out.println(arrayList2);
        arrayList2.add(5,5);  // will get java.lang.IndexOutOfBoundsException:
        System.out.println(arrayList2);

        // ArrayList.add(value)      // Tme Complexity O(1)
        // ArrayList.add(index,value) // Time Complexity O(n)


    }

}
