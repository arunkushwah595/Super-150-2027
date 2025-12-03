package Lec56;

import java.util.HashMap;

public class DisJoinSet {

	class Node {
		int val;
		int rank;
		Node parent;
	}

	private HashMap<Integer, Node> map = new HashMap<>();

	public void create(int v) {
		Node nn = new Node();
		nn.val = v;
		nn.rank = 0;
		nn.parent = nn;
		map.put(v, nn);
	}

	public int find(int v) {
		Node node = map.get(v);
		return find(node).val;
	}

	private Node find(Node node) {
		if (node.parent == node) {
			return node;
		}
		Node n = find(node.parent);
		node.parent = n; // path compression
		return n;
	}

	public void union(int v1, int v2) {
		Node node1 = map.get(v1); // v1 vtx kaha pe create hua hai
		Node node2 = map.get(v2); // v2 vtx kaha pe create hua hai
		Node rep1 = find(node1); // v1 ka representative node hai
		Node rep2 = find(node2); // v2 ka representative node hai

		if (rep1.rank == rep2.rank) {
			rep1.parent = rep2;
			rep2.rank++;
		}

		else if (rep1.rank < rep2.rank) {
			rep1.parent = rep2;
		}

		else {
			rep2.parent = rep1;
		}

	}

}
