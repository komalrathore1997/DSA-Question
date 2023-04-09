package LinkedListQuestions;

public class LinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
//	method to insert a new node
	
	public static LinkedList insert(LinkedList list,int data) {
		Node new_node=new Node(data);
		if(list.head == null) {
			list.head = new_node;
		}else {
			Node last=list.head;
			while(last.next != null) {
				last=last.next;
			}
			last.next=new_node;
		}
		return list;
	}
	
    
	private static void printList(LinkedList l) {
		Node currNode=l.head;
		while(currNode!=null) {
			System.out.println(currNode.data+" ");
			currNode=currNode.next;
		}
		
	}
     
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l=insert(l,1);
		l=insert(l,2);
		printList(l);
	}
}
