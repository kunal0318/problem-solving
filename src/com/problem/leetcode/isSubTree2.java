package com.problem.leetcode;

public class isSubTree2 {
	
	public static void main(String[] args) {


		TreeNode root = new TreeNode(1);
		root.setLeft(new TreeNode(5));
		root.setRight(new TreeNode(2));
		root.getRight().setRight(new TreeNode(4));
		root.getRight().setLeft(new TreeNode(3));
		//root.getRight().getLeft().setRight(new TreeNode(6));

		TreeNode subTreeRoot = new TreeNode(2);
		subTreeRoot.setRight(new TreeNode(4));
		subTreeRoot.setLeft(new TreeNode(3));
		System.out.println( isSubtree(root, subTreeRoot));
		
	}
	
	 public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
		 
		 return inOrderTraversal(root).contains(inOrderTraversal(subRoot)) && preOrderTraversal(root).contains(preOrderTraversal(subRoot)) && postOrderTraversal(root).contains(postOrderTraversal(subRoot));
		 
//		 boolean isInorder = inOrderTraversal(root).contains(inOrderTraversal(subRoot));
//		 boolean ispreOrder = preOrderTraversal(root).contains(preOrderTraversal(subRoot));
//		 boolean ispostOrder = postOrderTraversal(root).contains(postOrderTraversal(subRoot));
//		 return isInorder && ispreOrder && ispostOrder;
	 }
	
	private static String inOrderTraversal(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		if(root == null) return "";
		sb.append(inOrderTraversal(root.left));
		sb.append(root.val);
		sb.append(inOrderTraversal(root.right));
		return sb.toString();
	}
	
	private static String preOrderTraversal(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		if(root == null) return "";
		sb.append(root.val);
		sb.append(preOrderTraversal(root.left));
		sb.append(preOrderTraversal(root.right));
		return sb.toString();
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
