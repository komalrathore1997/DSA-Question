package StackQuestion;

import java.util.EmptyStackException;

public class ImplementSLL {
     Node top;
     int length;
     
     static class Node{
    	 int data;
    	 Node next;
    	 
    	 Node(int d){
    		 this.data=d;
    	 }
     }
     
     public ImplementSLL() {
    	 top=null;
    	 length=0;
     }
     
     public int length() {
    	 return length;
     }
     
     public boolean isEmpty() {
    	 return length==0;
     }
     
     public static void main(String[] args) {
		 ImplementSLL s=new ImplementSLL();
		 Node push = s.push(10);
	     s.push(20);
	     s.push(30);
	}


	private Node push(int data) {
		Node newNode=new Node(data);
		newNode.next=top;
		top=newNode;
		length++;
		return top;
		
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		int result= top.data;
		top=top.next;
		length--;
		return result;
		
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	
}
