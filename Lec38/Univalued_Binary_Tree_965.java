package Lec38;

public class Univalued_Binary_Tree_965 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public boolean isUnivalTree(TreeNode root) {
			if (root == null) {
				return true;
			}
			int val = root.val;
			return isUniversal(root, val);
		}

		public boolean isUniversal(TreeNode root, int val) {
			if (root == null) {
				return true;
			}
			if (root.val != val) {
				return false;
			}

			boolean left = isUniversal(root.left, val);
			boolean right = isUniversal(root.right, val);

			return left && right;
		}
	}
}
