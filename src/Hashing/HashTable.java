package Hashing;

public class HashTable {
    private HashNode[] buckets;
    private int numOfBuckets;  //capacity;
    private int size; //number of key-value pairs in hash table or number of hash nodes in hashtable;
    
    public HashTable() {
    	this(10); //default capacity
    }
    
    public HashTable(int capacity) {
    	this.numOfBuckets=capacity;
    	this.buckets=new HashNode[numOfBuckets];
    	this.size=0;
    }
    private class HashNode{
    	private Integer key;
    	private String value;
    	private HashNode next;
    	
    	public HashNode(Integer key,String value) {
    		this.key=key;
    		this.value=value;
    	}
    }
    
    public int size() {
    	return size;
    }
    
    public boolean isEmpty() {
    	return size==0;
    }
    
//    put a key-value pair in a HashTable using seprate chaining
    public void put(Integer key,String value) {
    	
    }
    
    public String  get(Integer key) {
    	return null;
    }
    
    public String remove(Integer key) {
		return null;
    	
    }
}
