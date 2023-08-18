package StackQuestion;

import java.util.Stack;

public class ReverseStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		reverse(stack);
		System.out.println(stack);
	}

	private static void reverse(Stack<Integer> stack) {
         if(stack.isEmpty()) {
        	 return;
         }
         int num=stack.pop();
         reverse(stack);
         AddAtBottom(stack,num);
	}

	private static void AddAtBottom(Stack<Integer> stack, int num) {
		 if(stack.isEmpty()) {
			 stack.add(num);
			 return;
		 }
		 AddAtBottom(stack,num);
		
	}
}
