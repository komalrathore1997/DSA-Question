package LinkedListQuestions;

public class DeletionInLinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		DeletionInLinkedList list = new DeletionInLinkedList();
		list.appned(8);
		list.appned(9);
		list.appned(10);
		list.appned(11);
		list.appned(12);
		printList(list);
		list = delete(list, 1);
	}

	private static DeletionInLinkedList delete(DeletionInLinkedList list, int p) {
		Node temp = list.head;
		Node prev = list.head;
		for (int i = 0; i < p; i++) {
			if (i == 0 && p == 1) {
				list.head = list.head.next;
			}else {
				if(i==p-1 && temp!=null) {
					prev.next=temp.next;
				}else {
					prev=temp;
					if(prev==null)
						break;
					temp=temp.next;
				}
			}
		}
		return list;

	}

	private static void printList(DeletionInLinkedList list) {
		Node currNode = list.head;
		while (currNode != null) {
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
		System.out.println();
	}

	private void appned(int i) {
		Node newNode = new Node(i);
		if (head == null) {
			head = newNode;
		} else {
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}

	}
}
