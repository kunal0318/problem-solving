package com.problem.tree;

public class PostOrderTraversal {
	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(5);
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(4);
		root.right.left = new TreeNode(3);

		System.out.println(postOrderTraversal(root));
	}

	private static String postOrderTraversal(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		if(root == null) return "";
		sb.append(postOrderTraversal(root.left));
		sb.append(postOrderTraversal(root.right));
		sb.append(root.val);
		return sb.toString();
	}
}
