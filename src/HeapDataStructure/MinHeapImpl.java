package HeapDataStructure;

public class MinHeapImpl {

	private int[] heapArray;
	private int capacity;
	private int size;

	public MinHeapImpl(int capacity) {
		super();
		this.capacity = capacity;
		this.size = 0;
		this.heapArray = new int[capacity];
	}

	private int parent(int key) {
		return (key - 1) / 2;
	}

	private int leftChild(int key) {
		return 2 * key + 1;
	}

	private int rightChild(int key) {
		return 2 * key + 2;
	}

	public static void main(String[] args) {
		MinHeapImpl h = new MinHeapImpl(11);
		h.insert(12);
		h.insert(2);
		h.insert(1);
		h.print();

	}

	private void insert(int ele) {
         if(size==capacity) {
        	 return;
         }
         int i=size;
         size++;
         heapArray[size-1]=ele;
         while(i!=0 && heapArray[parent(i)]>heapArray[i]) {
        	 swap(parent(i),heapArray[i]);
        	 i=parent(i);
         }
	}
	
	public void print()
    {
        for (int i = 1; i <= size / 2; i++) {
 
            System.out.print(
                " PARENT : " + heapArray[i]
                + " LEFT CHILD : " + heapArray[2 * i]
                + " RIGHT CHILD :" + heapArray[2 * i + 1]);
 
            System.out.println();
        }
    }

	private void swap(int parent, int heapArray) {
		int temp=parent;
		parent=heapArray;
		heapArray=temp;	
	}
}
