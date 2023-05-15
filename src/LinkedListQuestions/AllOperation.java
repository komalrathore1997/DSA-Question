package LinkedListQuestions;

public class AllOperation {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	public static void main(String[] args) {
		AllOperation list=new AllOperation();
		list.append(6);
		list.push(4);
	}
	
	
	private void push(int i) {
		Node new_node=new Node(i);
		new_node.next=head;
		head=new_node;
	}


	private void append(int i) {
		Node new_node=new Node(i);
		if(head==null) {
			head=new_node;
			return;
		}
		
		new_node.next=null;
		Node last=head;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=new_node;
		return;
	}
	
}
