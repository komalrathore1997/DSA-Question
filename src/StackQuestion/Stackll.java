package StackQuestion;

import StackQuestion.StackLL.Node;

public class Stackll {
	static Node head;

	static class Node {

		int val;
		Node next;

		Node(int val) {
			this.val = val;
			this.next = null;
		}

	}

	public static void main(String[] args) {
		Stackll stack=new Stackll();
		stack.push(1);
	}

	private void push(int val) {
	     Node temp=new Node(val);
	     if(head==null) {
	    	 head=temp;
	     }else {
	    	 head.next=temp;
	    	 
	     }
	     
	     
	     
	}

}
