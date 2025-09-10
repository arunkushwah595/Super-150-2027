package Lec49;

import java.util.Arrays;

public class Knapsack_Zero_One {

	public static void main(String[] args) {
		int cap = 4;
		int[] wt = { 1, 2, 3, 2, 2 };
		int[] val = { 8, 4, 0, 5, 3 };
		int[][] dp = new int[wt.length][cap + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Knapsack(wt, val, cap, 0, dp));
	}

	public static int Knapsack(int[] wt, int[] val, int cap, int i, int[][] dp) {
		if (cap == 0 || i == wt.length) {
			return 0;
		}
		if (dp[i][cap] != -1) {
			return dp[i][cap];
		}
		int inc = 0, exc = 0;
		if (cap >= wt[i]) {
			inc = val[i] + Knapsack(wt, val, cap - wt[i], i + 1, dp);
		}
		exc = Knapsack(wt, val, cap, i + 1, dp);

		return dp[i][cap] = Math.max(inc, exc);
	}

}
