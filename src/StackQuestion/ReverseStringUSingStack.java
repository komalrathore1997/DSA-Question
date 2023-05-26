package StackQuestion;

import java.util.Stack;

public class ReverseStringUSingStack {
	public static void main(String[] args) {
		String s = "komal";
		char[] chars = s.toCharArray();
		Stack<Character> s1 = new Stack<>();
		for (Character c : chars) {
			s1.push(c);
		}

		for (int i = 0; i < s.length(); i++) {
			chars[i] = s1.pop();
		}
		System.out.println(new String(chars));
	}
}
