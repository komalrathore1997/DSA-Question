package LinkedListQuestions;

public class ReverseLinked {
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
    	ReverseLinked list=new ReverseLinked();
    	list.appned(1);
    	list.appned(2);
    	list.appned(3);
    	list.appned(4);
    	list.appned(5);
    	System.out.println("Linked List: ");
    	list.printlist(list);
    	System.out.println();
    	System.out.println("Reverse Linked List: ");
    	list.reverseIteration(list);
    	list.printlist(list);
    	
    	
	}
	private void reverseIteration(ReverseLinked list) {
		 if(head==null || head.next==null) {
			 return;
		 }
		 Node preNode=list.head;
		 Node currNode=list.head.next;
		 while(currNode!=null) {
			 Node nextNode=currNode.next;
			 currNode.next=preNode;
			 
//			 update node
			 preNode=currNode;
			 currNode=nextNode;
		 }
		 head.next=null;
		 list.head=preNode;
		 
	}
	private void printlist(ReverseLinked list) {
		Node cn=list.head;
		while(cn!=null) {
			System.out.print(cn.data+"->");
			cn=cn.next;
		}
		
	}
	private void appned(int i) {
		 Node newNode=new Node(i);
		 if(head==null) {
			 head=newNode;
		 }else {
			 Node last=head;
			 while(last.next!=null) {
				 last=last.next;
			 }
			 last.next=newNode;
		 }
	}
}
