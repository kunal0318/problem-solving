package com.problem.leetcode;

import com.problem.tree.TreeNode;

public class IsSubTree {
	
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
		System.out.println(isSubTree(root, subTreeRoot));
	}
	
	
	
	private static boolean isIdentical(TreeNode root, TreeNode subTree) {
		if (root == null && subTree == null) {
			return true;
		} else if (root == null || subTree == null) {
			return false;
		} else {
			return root.getVal() == subTree.getVal() && isIdentical(root.getLeft(), subTree.getLeft())
					&& isIdentical(root.getRight(), subTree.getRight());
		}
	}

	private static boolean isSubTree(TreeNode root, TreeNode subTree) {
		if (subTree == null) {
			return true;
		}
		if (root == null) {
			return false;
		}
		boolean isIdentical = isIdentical(root, subTree);
		if (isIdentical) {
			return true;
		}
		return isSubTree(root.getLeft(), subTree) || isSubTree(root.getRight(), subTree);
	}

	
	
	
}
