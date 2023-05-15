package LinkedListQuestions;

public class LengthOFLinkedList {
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
    	LengthOFLinkedList list=new LengthOFLinkedList();
    	list.push(34);
    	list.push(12);
    	list.push(8);
    	list.push(12);
    	list.push(12);
    	list.push(12);
    	list.push(12);
    	int findLength = list.findLength(list);
    	System.out.println(findLength);
	}

	private int  findLength(LengthOFLinkedList list) {
		Node curr=list.head;
		int count=0;
		while(curr!=null) {
			count++;
			curr=curr.next;
			
		}
		return count;
		
		
	}

	private void push(int i) {
		Node new_node=new Node(i);	
		new_node.next=head;
		head=new_node;
		
	}
}
