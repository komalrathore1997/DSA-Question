package StackQuestion;

import java.util.Stack;

// Java code for stack implementation
public class ImpementUsingArrays {
	static final int max=1000;
	int a[]=new int[max];
	int top;
	
    public static void main(String[] args) {
    	ImpementUsingArrays s=new ImpementUsingArrays();
    	s.push(10);
    	s.push(20);
    	s.push(30);
    	System.out.println(s.pop()+"popper from stack");
    	System.out.println("The Top Element is "+s.peek());
        System.out.print("Elements present in stack :");
    	s.print();
	}

	private void print() {
		for(int i=top;i>=0;i--) {
			System.out.println(" "+a[i]);
		}
		
	}

	private int peek() {
		if(top<0) {
			System.out.println("stack underflow");
			return 0;
		}
		int x=a[top];
		return x;
	}

	private int pop() {
		if(top<0) {
			System.out.println("stack underflow");
			return 0;
		}else {
			int x=a[top--];
			return x;
		}
	}

	private boolean push(int x) {
		if(top>=max-1) {
			System.out.println("Stack Overflow !!!");
			return false;
		}else {
			a[++top]=x;
			System.out.println(x+" pushed into stack");
			return true;
		}
	}
}
