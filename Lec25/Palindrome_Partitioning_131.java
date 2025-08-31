package Lec25;

import java.util.*;

public class Palindrome_Partitioning_131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "nitin";
		List<String> ll = new ArrayList<String>();
		List<List<String>> nl = new ArrayList<List<String>>();
		partition(ques, ll, nl);
		System.out.println(nl);
	}

	public static void partition(String ques, List<String> ll, List<List<String>> nl) {
		if (ques.length() == 0) {
			nl.add(new ArrayList<String>(ll));
			return;
		}
		for (int cut = 1; cut <= ques.length(); cut++) {
			String s = ques.substring(0, cut);
			if (isPallindrome(s)) {
				ll.add(s);
				partition(ques.substring(cut), ll, nl);
				ll.remove(ll.size() - 1);
			}
		}
	}

	public static boolean isPallindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
