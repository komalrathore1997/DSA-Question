package LinkedListQuestions;

public class Main {
	public static void main(String[] args) {
		LLKunal ll = new LLKunal();
		ll.insertFirst(10);
		ll.insertFirst(20);
		ll.insertFirst(30);
		ll.insertFirst(40);
		ll.insertLast(99);
		ll.insertMiddle(55,4);
		ll.printLL();
		ll.deleteFirst();
		ll.printLL();
		ll.deleteEnd();
		ll.printLL();

	}
}
 