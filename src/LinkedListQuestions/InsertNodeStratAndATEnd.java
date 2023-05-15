package LinkedListQuestions;

public class InsertNodeStratAndATEnd {
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
		InsertNodeStratAndATEnd list = new InsertNodeStratAndATEnd();
		list = list.insertAtStart(list, 1);
		list = list.insertAtStart(list, 3);
		list = list.insertAtStart(list, 5);
		list = list.insertAtEnd(list, 7);
		printLinkedList(list);
	}

	private InsertNodeStratAndATEnd insertAtEnd(InsertNodeStratAndATEnd list, int i) {
		Node nn=new Node(i);
		Node cn=list.head;
		if(head==null) {
			head=new Node(i);
		}
		nn.next=null;
		Node last=head;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=nn;
		return list; 
	}

	private static void printLinkedList(InsertNodeStratAndATEnd list) {
		Node cn = list.head;
		while (cn != null) {
			System.out.println(cn.data);
			cn=cn.next;
		}
	}

	private InsertNodeStratAndATEnd insertAtStart(InsertNodeStratAndATEnd list, int i) {
		Node newnode = new Node(i);
		newnode.next = head;
		head = newnode;
		return list;

	}
}
