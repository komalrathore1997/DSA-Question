package StackQuestion;

public class StackLL {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;

		}
	}

	public static void main(String[] args) {
		StackLL s = new StackLL();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		while(!isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

	private int pop() {
		if(isEmpty()) {
			return -1;
		}
		Node top=head;
		head=head.next;
		return top.data;
	}

	private int peek() {
		if(isEmpty()) {
			return -1;
		}
		Node top=head;
		return top.data;
	}

	private void push(int i) {
		Node newNode = new Node(i);
		if (isEmpty()) {
			head = newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}

	public static boolean isEmpty() {
		return head == null;
	}
}
