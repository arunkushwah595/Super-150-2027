package Lec22;

import java.util.*;

public class Generate_Parenthesis_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		List<String> ll=new ArrayList<String>();
		print(n*2,"",ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
	}
	
	
	public static boolean isValid(String s) {
		while(true) {
			if(s.contains("[]")) {
				s=s.replace("[]", "");
			}
			else if(s.contains("{}")) {
				s=s.replace("{}", "");
			}
			else if(s.contains("()")) {
				s=s.replace("()", "");
			}
			else {
				return s.isEmpty();
			}
		}
	}
	
	
	public static void print(int n,String ans,List<String> ll) {
		if(n==0) {
			if(isValid(ans)) {
				ll.add(ans);
				return;
			}
			return;
		}
		print(n-1, ans+"(",ll);
		print(n-1, ans+")",ll);
	}

}
