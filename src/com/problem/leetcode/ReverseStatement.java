package com.problem.leetcode;

import java.util.Stack;

public class ReverseStatement {
	public static void main(String[] args) {
		String s = "   the sky is blue    ";
		System.out.println(reverseWords(s));
	}

	private static String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
			}else{	
				if (sb.length() == 0) {
					continue;
				}
				stack.add(sb.toString());
				sb.setLength(0);
			}
		}
		if (sb.length() > 0) {
			sb.append(" ");
		}
		
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
			if (!stack.isEmpty()) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
}
