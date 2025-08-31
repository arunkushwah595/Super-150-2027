package Lec28;

import java.util.Stack;

public class Construct_Smallest_Number_From_DI_String_2375 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "IIIDIDDD";
		System.out.println(construct(pattern));
	}

	public static String construct(String str) {
		int[] ans = new int[str.length() + 1];
		int c = 1;
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i <= str.length(); i++) {
			if (i == str.length() || str.charAt(i) == 'I') {
				ans[i] = c;
				c++;
				while(!st.isEmpty()) {
					ans[st.pop()]=c;
					c++;
				}
			} 
			else {
				st.push(i);
			}
		}
		String s = "";
		for (int v : ans) {
			s += v;
		}
		return s;
	}
}
