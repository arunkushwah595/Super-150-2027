package Lec38;

public class Inorder_Successor_in_BST_285 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class Solution {
		TreeNode SuccessorNode = null;

		public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
			return successor(root, p);
		}

		public TreeNode successor(TreeNode root, TreeNode p) {
			if (root == null) {
				return null;
			}
			if (root.val > p.val) {
				SuccessorNode = root;
				successor(root.left, p);
			} else {
				successor(root.right, p);
			}
			return SuccessorNode;
		}

	}

}
