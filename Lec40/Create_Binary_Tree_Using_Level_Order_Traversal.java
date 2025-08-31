package Lec40;

import java.util.*;

import Lec40.Create_Binary_Tree_Using_Level_Order_Traversal.Node;

public class Create_Binary_Tree_Using_Level_Order_Traversal {

	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public Create_Binary_Tree_Using_Level_Order_Traversal() {
		// TODO Auto-generated constructor stub
		createTree();
	}

	private void createTree() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<Node> q = new LinkedList<Node>();
		Node nn = new Node();
		nn.val = sc.nextInt();
		root = nn;
		q.add(nn);
		while (!q.isEmpty()) {
			Node r = q.poll();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node node = new Node();
				node.val = c1;
				r.left = node;
				q.add(node);
			}
			if (c2 != -1) {
				Node node = new Node();
				node.val = c2;
				r.right = node;
				q.add(node);
			}
		}
		sc.close();
	}

	public static void main(String[] args) {

	}

}
