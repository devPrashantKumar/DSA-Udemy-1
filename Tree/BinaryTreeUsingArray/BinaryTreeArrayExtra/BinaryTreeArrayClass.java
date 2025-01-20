package Tree.BinaryTreeUsingArray.BinaryTreeArrayExtra;

public class BinaryTreeArrayClass {
    int[] arr;
    int lastUsedIndex;

    BinaryTreeArrayClass(int size){
        this.arr = new int[size+1];
        lastUsedIndex=0;
    }

    public boolean isFull(){
        return lastUsedIndex==arr.length-1;
    }

    public void insertNode(int data){
        if(!isFull()){
            arr[++lastUsedIndex]= Integer.valueOf(data);
        }else{
            System.out.println("space is full");
        }
    }

    public void inOrderTraversal(int nodeIndex){
        if(nodeIndex>lastUsedIndex){
            return;
        }
        inOrderTraversal(2*nodeIndex);
        System.out.print(arr[nodeIndex]+" ");
        inOrderTraversal(2*nodeIndex+1);
    }

    public void preOrderTraversal(int nodeIndex){
        if(nodeIndex>lastUsedIndex){
            return;
        }
        System.out.print(arr[nodeIndex]+" ");
        preOrderTraversal(2*nodeIndex);
        preOrderTraversal(2*nodeIndex+1);
    }

    public void postOrderTraversal(int nodeIndex){
        if(nodeIndex>lastUsedIndex){
            return;
        }
        postOrderTraversal(2*nodeIndex);
        postOrderTraversal(2*nodeIndex+1);
        System.out.print(arr[nodeIndex]+" ");
    }

    public void levelOrderTraversal(){
        for(int i=1;i<=lastUsedIndex;i++)
        System.out.print(arr[i]+" ");
    }

    public boolean searchNode(int data){
        for(int i=1;i<=lastUsedIndex;i++){
            if(arr[i]==data) return true;
        }
        return false;
    }

    public void deleteNode(int data){
        for(int i=1;i<=lastUsedIndex;i++){
            if(arr[i]==data){
                arr[i]=arr[lastUsedIndex--];
            }
        }
    }
}
