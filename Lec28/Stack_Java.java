package Lec28;

import java.util.Stack;

public class Stack_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		System.out.println(st.capacity());

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
		st.push(110); // push

		System.out.println(st.peek());
		System.out.println(st.size());
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.capacity()); // 20 kyuki default 10 hota hai or humne 11 entries enter krr di hai isliye
											// ab capacity 20 ho gayi
		Add_Last(st, 6);
		System.out.println(st);

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
