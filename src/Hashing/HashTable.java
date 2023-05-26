package Hashing;

public class HashTable {
	private HashNode[] buckets;
	private int numOfBuckets; // capacity;
	private int size; // number of key-value pairs in hash table or number of hash nodes in hashtable;

	public HashTable() {
		this(10); // default capacity
	}

	public HashTable(int capacity) {
		this.numOfBuckets = capacity;
		this.buckets = new HashNode[numOfBuckets];
		this.size = 0;
	}

	private class HashNode {
		private Integer key;
		private String value;
		private HashNode next;

		public HashNode(Integer key, String value) {
			this.key = key;
			this.value = value;
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

//    put a key-value pair in a HashTable using seprate chaining
	public void put(Integer key, String value) {
		if (key == null || value == null) {
			throw new IllegalArgumentException("Key Or Value is null !!!");
		}
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		while (head != null) {
			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		size++;
		head = buckets[bucketIndex];
		HashNode node = new HashNode(key, value);
		node.next = head;
		buckets[bucketIndex] = node;
	}

	private int getBucketIndex(Integer key) {
		return key % numOfBuckets;
	}

	public String get(Integer key) {
		if (key == null) {
			throw new IllegalArgumentException("key is null !!!");
		}
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		while (head != null) {
			if (head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}

	public String remove(Integer key) {
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		HashNode pre = null;
		while (head != null) {
			if (head.key.equals(key)) {
				break;
			}
			pre = head;
			head = head.next;
		}
		if (head == null) {
			return null;
		}
		size--;
		if (pre != null) {
			pre.next = head.next;
		} else {
			buckets[bucketIndex] = head.next;
		}

		return head.value;

	}

	public static void main(String[] args) {
		HashTable table=new HashTable();
		table.put(21, "komal");
		table.put(21, "ko");
		table.put(22, "tanu");

		System.out.println(table.size());
		System.out.println(table.get(22));
		System.out.println(table.get(90));
		table.remove(21);
		System.out.println(table.remove(21));
		

	}
}
