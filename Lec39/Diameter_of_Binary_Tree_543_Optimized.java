package Lec39;


public class Diameter_of_Binary_Tree_543_Optimized {

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
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root).dt;
		}

		public Diapair diameter(TreeNode root) {
			if(root==null) {
				return new Diapair();
			}
			Diapair ldp = diameter(root.left); // dt ht
			Diapair rdp = diameter(root.right); // dt ht
			int sd=ldp.ht+rdp.ht+2;
			Diapair sdp=new Diapair();
			sdp.dt=Math.max(sd, Math.max(rdp.dt, ldp.dt));
			sdp.ht=Math.max(ldp.ht, rdp.ht)+1;
			return sdp;
		}

		class Diapair {
			int dt = 0;
			int ht = -1;
		}
	}
}
