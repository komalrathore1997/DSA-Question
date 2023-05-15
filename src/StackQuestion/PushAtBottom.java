package StackQuestion;

import java.util.Stack;

public class PushAtBottom {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		pushAtBottom(5,stack);
		while (!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
		}
	}

	private static void pushAtBottom(int i, Stack<Integer> stack) {
		if(stack.isEmpty()) {
			 stack.push(i);
			 return;
		}
		int temp=stack.pop();
		pushAtBottom(i,stack);
		stack.push(temp);
		
	}
	
	
	
}
