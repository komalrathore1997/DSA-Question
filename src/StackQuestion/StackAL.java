package StackQuestion;

import java.util.ArrayList;

public class StackAL {
	static class Stack {
		ArrayList<Integer> list = new ArrayList();

		private void push(int i) {
			list.add(i);
		}

		public boolean isEmpty() {
			return list.size()==0;
		}

		public int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top=list.remove(list.size()-1);
			return top;
		}

		public int peek() {
			if(isEmpty()) {
				return -1;
			}
			return list.get(list.size()-1);
		}
	}

	public static void main(String[] args) {
		Stack al = new Stack();
		al.push(1);
		al.push(2);
		al.push(3);
		al.push(4);
		al.push(5);
		while (!al.isEmpty()) {
           System.out.println(al.peek());
           al.pop();
		}
	}

}
