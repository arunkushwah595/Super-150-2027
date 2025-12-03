package Lec56;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Cycle_Detection_In_Directed_Graph {

	private HashMap<Integer, List<Integer>> map;

	public int[] indegree() {
		int[] in = new int[map.size()];
		for (int v1 : map.keySet()) {
			for (int v2 : map.get(v1)) {
				in[v2]++;
			}
		}
		return in;
	}

	public boolean isCycle() {
		Queue<Integer> q = new LinkedList<>();
		int[] in = indegree();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}

		int c = 0;
		while (!q.isEmpty()) {
			int r = q.poll();
			c++;
			for (int nbrs : map.get(r)) {
				in[nbrs]--;
				if (in[nbrs] == 0) {
					q.add(nbrs);
				}
			}
		}
		return c != map.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
