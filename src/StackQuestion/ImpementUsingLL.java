package StackQuestion;

public class ImpementUsingLL {
	Node head;
	 
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data=d;
		}
	}
    public static void main(String[] args) {
    	ImpementUsingLL s=new ImpementUsingLL();
    	s.push(10);
	}
	private void push(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}else {
			Node temp=head;
			head=newNode;
			newNode.next=temp;
		}
		System.out.println(data+"Pushed into stack");
		
		
	}
}
