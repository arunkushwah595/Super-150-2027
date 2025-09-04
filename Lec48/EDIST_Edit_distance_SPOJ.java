package Lec48;

import java.util.Arrays;
import java.util.Scanner;

public class EDIST_Edit_distance_SPOJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			String t = sc.next();
			int[][] dp = new int[s.length()][t.length()];
			for (int[] row : dp) {
				Arrays.fill(row, -1);
			}
			System.out.println(Min_oprn(s, t, 0, 0, dp));
		}
//		String s = "FOOD", t = "MONEY";
//		System.out.println(Min_oprn(s, t, 0, 0, dp));
	}

	public static int Min_oprn(String s, String t, int i, int j, int[][] dp) {
		if (i == s.length()) {
			return t.length() - j;
		}
		if (j == t.length()) {
			return s.length() - i;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (s.charAt(i) == t.charAt(j)) {
			ans = Min_oprn(s, t, i + 1, j + 1, dp);
		} else {
			int delete = Min_oprn(s, t, i + 1, j, dp);
			int replace = Min_oprn(s, t, i + 1, j + 1, dp);
			int Insert = Min_oprn(s, t, i, j + 1, dp);
			ans = Math.min(delete, Math.min(replace, Insert)) + 1;
		}
		return dp[i][j] = ans;
	}

}
