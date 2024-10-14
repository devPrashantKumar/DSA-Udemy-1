package BinaryHeap;

public class BinaryHeapClass {
    private int[] arr;
    private int sizeOfTree;

    public BinaryHeapClass(int size) {
        this.arr = new int[size + 1];
        this.sizeOfTree = 0;
    }

    public boolean isEmpty() {
        return sizeOfTree == 0;
    }

    public Integer peek() {
        if (isEmpty())
            return null;
        return arr[1];
    }

    public int sizeOfBH() {
        return sizeOfTree;
    }

    public void printLevelOrderTraversal() {
        for (int i = 1; i <= sizeOfTree; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void printPreOrderTraversal(int index) {
        if (index > sizeOfTree)
            return;
        System.out.print(arr[index] + " ");
        printPreOrderTraversal(2 * index);
        printPreOrderTraversal(2 * index + 1);
    }

    public void printPostOrderTraversal(int index) {
        if (index > sizeOfTree)
            return;
        printPostOrderTraversal(2 * index);
        printPostOrderTraversal(2 * index + 1);
        System.out.print(arr[index] + " ");
    }

    public void printInOrderTraversal(int index) {
        if (index > sizeOfTree)
            return;
        printInOrderTraversal(2 * index);
        System.out.print(arr[index] + " ");
        printInOrderTraversal(2 * index + 1);
    }

    public void heapify(int index) {
        if (index <= 1)
            return;
        int parent = index / 2;
        if (arr[parent] > arr[index]) {
            int temp = arr[parent];
            arr[parent] = arr[index];
            arr[index] = temp;
            heapify(parent);
        }
    }

    public void insertElementInHeap(int data) {
        arr[++sizeOfTree] = data;
        heapify(sizeOfTree);
    }

    public void deleteBH(){
        this.arr = null;
    }
}
