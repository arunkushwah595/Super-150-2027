package Lec25;

import java.util.*;

public class Combinational_Sum_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;
		List<List<Integer>> nl = new ArrayList<List<Integer>>();
		List<Integer> ll = new ArrayList<Integer>();
		Combination(candidates, target, ll, 0, nl);
		System.out.println(nl);

	}

	public static void Combination(int[] coin, int amount, List<Integer> ll, int idx, List<List<Integer>> nl) {
		if (amount == 0) {
			nl.add(new ArrayList<Integer>(ll));
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				ll.add(coin[i]);
				Combination(coin, amount - coin[i], ll, i, nl);
				ll.remove(ll.size() - 1);
			}
		}
	}

}
