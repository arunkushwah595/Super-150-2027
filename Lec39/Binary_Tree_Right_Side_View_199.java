package Lec39;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Right_Side_View_199 {

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
		int max_depth = -1;

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ll = new ArrayList<Integer>();
			rightView(root, ll, 0);
			return ll;
		}

		public void rightView(TreeNode root, List<Integer> ll, int curr_Level) {
			if (root == null) {
				return;
			}
			if (max_depth < curr_Level) {
				ll.add(root.val);
				max_depth = curr_Level;
			}
			rightView(root.right, ll, curr_Level + 1);
			rightView(root.left, ll, curr_Level + 1);
		}
	}
}
