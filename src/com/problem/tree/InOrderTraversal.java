package com.problem.tree;

public class InOrderTraversal {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(5);
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(4);
		root.right.left = new TreeNode(3);

		System.out.println(inOrderTraversal(root));
	}

	private static String inOrderTraversal(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		if(root == null) return "";
		sb.append(inOrderTraversal(root.left));
		sb.append(root.val);
		sb.append(inOrderTraversal(root.right));
		return sb.toString();
	}
	
}
