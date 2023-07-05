package LinkedListQuestions;

public class LLKunal {

	private Node head;
	private Node tail;

	private int size;

	public LLKunal() {
		this.size = 0;
	}

	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		if (tail == null) {
			tail = head;
		}
		size++;
	}

	public void printLL() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("End");
	}

	public void insertLast(int val) {
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		if (tail == null) {
			insertFirst(val);
			return;
		}
		size++;

	}

	public class Node {

		private int value;
		private Node next;

		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}

		public Node(int value) {
			this.value = value;
		}
	}

	public void insertMiddle(int val,int index) {
		 if(index==0) {
			 insertFirst(val);
			 return;
		 }
		 if(index==size) {
			 insertLast(val);
			 return;
		 }
		 Node temp=head;
		 for(int i=1;i<index;i++) {
			 temp=temp.next;
		 }
		 Node node=new Node(val,temp.next);
		 temp.next=node;
		 size++;
		
	}

	public int deleteFirst() {
		int val=head.value;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		size--;
		return val;
	}

	public Node get(int index) {
		Node node=head;
		for(int i=0;i<index;i++) {
			node=node.next;
		}
		return node; 
	}
	
	public int deleteEnd() {
		if(size<=1) {
			return deleteFirst();
		}
		Node secondeLast=get(size-2);
		int val=tail.value;
		tail=secondeLast;
		tail.next=null;
		return val;
		
	}
	
	public int deleteMiddle(int index) {
		if(index==0) {
			return deleteFirst();
		}
		if(index==size-1) {
			return deleteEnd();
		}
		Node pre=get(index-1);
		int val=pre.next.value;
		pre.next=pre.next.next;
		
		return val;
	}

}
