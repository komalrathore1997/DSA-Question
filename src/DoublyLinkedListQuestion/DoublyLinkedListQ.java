package DoublyLinkedListQuestion;

import LinkedListQuestions.LL.Node;

public class DoublyLinkedListQ {
	Node head;

	public static class Node {
		int data;
		Node pre;
		Node next;

		Node(int d) {
			data = d;
			pre = null;
			next = null;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedListQ list = new DoublyLinkedListQ();
		list.push(0);
		printList(list);

	}

	private static void printList(DoublyLinkedListQ list) {
		
	}

	private void push(int i) {
		Node newNode=new Node(i);
		
		
		if(head!=null) {
			head.pre=newNode;
		}
		
		newNode.next=head;
		newNode.pre=null;
		head=newNode;
		
		
		
		

	}
}
