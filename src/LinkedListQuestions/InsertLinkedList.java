package LinkedListQuestions;

public class InsertLinkedList {

	public Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		InsertLinkedList list = new InsertLinkedList();
	    list = insert(list, 1);
	    list = insert(list, 2);
	    list = insert(list, 5);
	    printList(list);


	}

	private static void printList(InsertLinkedList list) {
		Node currNode=list.head;
		System.out.println("Linked List: ");
		while(currNode != null) {
			System.out.println(currNode.data+" ");
			currNode=currNode.next;
		}
	}

	private static InsertLinkedList insert(InsertLinkedList list, int data) {
		Node new_node = new Node(data);
		if (list.head == null) {
			list.head = new_node;
		}else {
			Node last=list.head;
			while(last.next!=null) {
				last=last.next;
			}
			
			last.next=new_node;
		}
		return list;

	}
}
