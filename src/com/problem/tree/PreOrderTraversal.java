package com.problem.tree;

public class PreOrderTraversal {
	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(5);
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(4);
		root.right.left = new TreeNode(3);

		System.out.println(preOrderTraversal(root));
	}

	private static String preOrderTraversal(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		if(root == null) return "";
		sb.append(root.val);
		sb.append(preOrderTraversal(root.left));
		sb.append(preOrderTraversal(root.right));
		return sb.toString();
	}
}
