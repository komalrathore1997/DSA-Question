package LinkedListQuestions;

public class InsertingLinkedList {
    Node head;
     
    static class Node {
    	int data;
    	Node next;
    	Node(int d){
    		data=d;
    		next=null;
    	}
    }
    
    public static void main(String[] args) {
    	InsertingLinkedList list=new InsertingLinkedList();
    	InsertingLinkedList list2=new InsertingLinkedList();
    	list.append(list,10);
//    	list.push(list,9);
    	list.append(list,20);
    	list.append(list,40);
    	list.append(list,50);
//    	list.push(list,1);
//    	list.insertInMiddel(list.head.next,12);
    	System.out.println("first linked list");
    	printlist(list);
    	list2.append(list,1);
    	list2.append(list,2);
    	list2.append(list,3);
    	System.out.println("second linked list");
    	printlist(list);
    	
    	int middle = list.getMiddle(list);
    	System.out.println("Middle Element:"+middle);
    	
    	
//    	insertInMid
    	InsertingLinkedList insertInMid = insertInMid(list,45);
        System.out.println("priniting in middle");
    	printlist(insertInMid);

	}

	
	private int getMiddle(InsertingLinkedList list) {
		 Node currNode=head;
         int count=0;
         while(currNode!=null){
             count++;
             currNode=currNode.next;
         }
         int middle=0;
         if(count%2==0){
              middle=(count/2)+1;
         }else{
              middle=(count/2)+1;
         }
         
         int i=1,data=head.data;
         Node cn=head;
         while(cn!=null){
             if(i==middle){
                 data= cn.data;
             }
             i++;
             cn=cn.next;
         }
         return data;
         
		
	}

	private void insertInMiddel(Node pri, int i) {	
		Node newNode=new Node(i);
		if(pri==null) {
			System.out.println("The given Previous node could not be null");
		}
		
		newNode.next=pri.next;
		pri.next=newNode;
	}

	private void push(InsertingLinkedList list, int i) {
		Node newNode=new Node(i);
		newNode.next=head;
		head=newNode;
	}

	private static void printlist(InsertingLinkedList list) {
		
		Node currNode=list.head;
		System.out.println("LinkedList: ");
		while(currNode!=null) {
			System.out.println(currNode.data);
			currNode=currNode.next;
		}
		System.out.println();
		
	}
	
	public static InsertingLinkedList insertInMid(InsertingLinkedList list, int data){
	       Node newNode=new Node(data);
	       Node last=list.head;
	       int count=0;
	       while(last!=null){
	           count++;
	           last=last.next;
	       }
	       int middle=0;
	       if(count%2==0){
	           middle=(count/2)+1;
	       }else{
	           middle=(count/2);
	       }
	       int i=1;
	       Node currNode=list.head;
	       while(currNode!=null){
	           if(i==middle+1){
	        	   newNode.next=currNode.next;
	        	   currNode.next=newNode;
	        	   currNode=newNode;
	           }
//	           currNode.next=currNode;
	           currNode=currNode.next;
	           i++;
	       }
	       return list;
	    }

	private void append(InsertingLinkedList list, int i) {
		Node newNode=new Node(i);
		if(head==null) {
			head=newNode;
		}else {
			Node last=head;
			if(last.next!=null) {
				last=last.next;
			}
			last.next=newNode;
		}
	}
}
