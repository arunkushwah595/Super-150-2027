package Lec57;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BellManFord {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public BellManFord(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);// v1--> map get kra then put v2 and Cost
	}

	class EdgePair {
		int e1, e2, cost;

		public EdgePair(int e1, int e2, int cost) {
			// TODO Auto-generated constructor stub
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return e1 + "  " + e2 + "  @ " + cost;
		}
	}

	public List<EdgePair> getAllEdge() {
		List<EdgePair> ll = new ArrayList<>();
		for (int e1 : map.keySet()) {
			for (int e2 : map.get(e1).keySet()) {
				int cost = map.get(e1).get(e2);
				ll.add(new EdgePair(e1, e2, cost));
			}
		}
		return ll;
	}

	public void BellManFord() {
		int v = map.size();
		int[] dp = new int[v + 1]; // 0 index kam ka nahi hai 1 indexed array banaya hai

		// src == 1
		for (int i = 2; i < dp.length; i++) {
			dp[i] = 9897612; // Yha ham Integer.MAX_VALUE nahi lenge kyuki usme cost add krne ke baad
								// overflow ho jayega
		}
		List<EdgePair> ll = getAllEdge();
		for (int i = 1; i <= v; i++) { // v-1 times relax karenge or vth time ham -ve wt cycle detect kre hai
			for (EdgePair e : ll) {
				if (i == v && dp[e.e2] > dp[e.e1] + e.cost) {
					System.out.println("-ve weight ka cycle hai");
					return;
				}
				if (dp[e.e2] > dp[e.e1] + e.cost) {
					dp[e.e2] = dp[e.e1] + e.cost;
				}
			}
		}
		for (int i = 1; i < dp.length; i++) {
			System.out.print(dp[i] + " ");
		}
	}

	public static void main(String[] args) {
		BellManFord bf = new BellManFord(5);
		bf.AddEdge(1, 2, 8);
		bf.AddEdge(1, 3, 4);
		bf.AddEdge(1, 4, 5);
		bf.AddEdge(2, 5, 2);
		bf.AddEdge(5, 2, 1);
		bf.AddEdge(3, 4, -3);
		bf.AddEdge(4, 5, 4);
		bf.BellManFord();

	}

}
