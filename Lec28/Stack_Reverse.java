package Lec28;

import java.util.Stack;

public class Stack_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();

		st.push(10); // push
		st.push(20); // push
		st.push(30); // push
		st.push(40); // push
		st.push(50); // push
		st.push(60); // push
		st.push(70); // push
		st.push(80); // push
		st.push(90); // push
		st.push(100); // push
		st.push(110); // push;
		
		System.out.println(st);
		Reverse(st);
		System.out.println(st);
	}

	public static void Reverse(Stack<Integer> st) {
		if (st.isEmpty()) {
			return;
		}
		int x = st.pop();
		Reverse(st);
		Add_Last(st, x);
	}
	
	public static void Add_Last(Stack<Integer> st, int item) {
		if (st.isEmpty()) {
			st.push(item);
			return;
		}
		int x = st.pop();
		Add_Last(st, item);
		st.push(x);
	}

}
