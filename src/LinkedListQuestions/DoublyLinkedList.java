package LinkedListQuestions;

public class DoublyLinkedList {
	
	public static void main(String[] args) {
		DoublyLinkedList list=new DoublyLinkedList();
		list.insetFirst(50);
		list.insetFirst(256);
		list.insetFirst(78);
		list.Display();
		list.DisplayReverse();
	}
	
	private Node head;
	public void insetFirst(int val) {
		Node node=new Node(val);
		node.next=head;
		node.prev=null;
		if(head!=null) {
			head.prev=node;
		}
		head=node;
	}
	
	public void insertEnd() {
		
	}
	
	public void Display() {
		Node temp=head;
		Node last =null;
		while(temp!=null) {
			System.out.print(temp.value+"->");
			last=temp;
			temp=temp.next;
		}
		System.out.println("End");
	}
	
	public void DisplayReverse() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.value+"->");
			temp=temp.prev;
		}
		System.out.println("End");
	}
	
	
	class Node {
		int value;
		Node next;
		Node prev;

		public Node(int value, Node next, Node prev) {
			super();
			this.value = value;
			this.next = next;
			this.prev = prev;
		}

		Node(int value) {
			this.value = value;
		}
	}
	
	

}
