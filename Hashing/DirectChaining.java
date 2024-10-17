package Hashing;
import java.util.LinkedList;

public class DirectChaining{
    private LinkedList<String>[] hashTable;
    private int size;

    @SuppressWarnings("unchecked")
    public DirectChaining(int size) {
        this.hashTable = new LinkedList[size];
        this.size=size;
    }

    public int hashValue(String key){
        int sum=0;
        for(int i=0;i<key.length();i++){
            sum += key.charAt(i);
        }
        return sum%size;
    }

    public void insertElement(String key){
        int hash = hashValue(key);
        if(hashTable[hash]==null){
            hashTable[hash]=new LinkedList<>();
        }
        hashTable[hash].add(key);
    }

    public boolean searchElement(String key){
        int hash = hashValue(key);
        if(hashTable[hash]!=null && hashTable[hash].contains(key)){
            return true;
        }
        return false;
    }

    public boolean deleteElement(String key){
        int hash = hashValue(key);
        boolean isElementExists = searchElement(key);
        if(isElementExists){
            return hashTable[hash].remove(key);      
        }
        return false;
    }

    public void printHashTable(){
        for(int i=0;i<size;i++){
            System.out.println("index : "+i+" key : "+hashTable[i]);
        }
    }
}