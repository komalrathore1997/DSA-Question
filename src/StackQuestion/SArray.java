package StackQuestion;

public class SArray {
	static final int MAX = 1000;
	int top;
	static int arr[] = new int[MAX];

	public static void main(String[] args) {
		SArray s = new SArray();
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		print(arr, s);
		System.out.println("peek element is :" + s.peek());
		System.out.println(s.pop()+": element pop form the stack.");
		System.out.println("peek element is :" + s.peek());


	}

	private int pop() {
		int x = 0;
		if(top==0) {
			System.out.println("Stack is Empty....");
		}else {
		    x=arr[top-1];
		    top--;
			
		}
		return x;
	}

	private int peek() {
		if (top < 0) {
			System.out.println("Stack Underflow.....");
		}
		int x = arr[top-1];
		return x;
	}

	private static void print(int[] arr, SArray s) {
		for (int i = 0; i < s.top; i++) {
			System.out.println(arr[i]);
		}

	}

	private void push(int value) {
		if (top > MAX - 1) {
			System.out.println("Stack Overflow condition........");
		} else {

			arr[top++] = value;
			System.out.println("value pushed into stack ....");
		}
	}

}
