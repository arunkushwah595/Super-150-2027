package Lec52;

import java.util.*;

public class Graph {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2);
	}

	public boolean ContainsVertex(int v1) {
		return map.containsKey(v1);
	}

	public int noOfEdge() {
		int sum = 0;
		for (int vtx : map.keySet()) {
			sum = sum + map.get(vtx).size();
		}
		return sum / 2;
	}

	public void removeEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}

	public void removeVertex(int v1) {
		for (int nbrs : map.get(v1).keySet()) { // nbrs ----> neighbours
			map.get(nbrs).remove(v1);
		}
		map.remove(v1);
	}

	public void Display() {
		for (int v : map.keySet()) {
			System.out.println(v + " " + map.get(v));
		}
	}

	public boolean HasPath(int src, int dest, HashSet<Integer> visited) {
		if (src == dest) {
			return true;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ans = HasPath(nbrs, dest, visited);
				if (ans) {
					return ans;
				}
			}
		}
		visited.remove(src); // optional
		return false;
	}

	public void PrintPath(int src, int dest, HashSet<Integer> visited, String ans) {
		if (src == dest) {
			System.out.println(ans + dest);
			return;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				PrintPath(nbrs, dest, visited, ans + src);
			}
		}
		visited.remove(src);
	}

}
