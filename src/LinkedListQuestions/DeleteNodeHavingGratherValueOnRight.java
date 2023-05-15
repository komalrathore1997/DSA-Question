package LinkedListQuestions;

public class DeleteNodeHavingGratherValueOnRight {
	Node head;

	public static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		DeleteNodeHavingGratherValueOnRight list = new DeleteNodeHavingGratherValueOnRight();
		list.add(12);
		list.add(15);
		list.add(10);
		list.add(11);
		list.add(5);
		list.add(6);
		list.add(2);
		list.add(3);

		printlist(list);

	}

	private static void printlist(DeleteNodeHavingGratherValueOnRight list) {
		Node last=list.head;
		 while(last!=null) {
			 System.out.println(last.data);
			 last=last.next;
		 }
	}

	private void add(int i) {
		Node curr = new Node(i);
		Node last = head;
		if (last != null) {
            last=last.next;
		}
		last.next=curr;
	}
}
