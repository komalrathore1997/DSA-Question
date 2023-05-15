package LinkedListQuestions;

public class SearchElement {
    static Node head;
    static class Node{
    	int data;
    	Node next;
    	Node(int d){
    		data=d;
    		next=null;
    	}
    }
    
    public static void main(String[] args) {
    	SearchElement list=new SearchElement();
    	int x=80;
    	list.push(list, 10);
    	list.push(list, 20);
    	list.push(list, 30);
    	list.push(list, 40);
    	list.push(list, 50);
    	list.push(list, 21);
    	
    	if(list.search(list.head,x)) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
	}

	private boolean search(Node head, int x) {
		Node currNode=head;
		while(currNode!=null) {
			if(currNode.data==x)
			return true;
			currNode=currNode.next;
		}
		return false;
	}

	private void push(SearchElement list, int i) {
		Node new_node=new Node(i);
		new_node.next=head;
		head=new_node;
	}

	
}
