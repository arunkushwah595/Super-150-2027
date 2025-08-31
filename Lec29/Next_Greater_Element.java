package Lec29;

import java.util.*;

public class Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
		int[] arr = { 4, 5, 2, 10 };
		NGE(arr);
	}

	public static void NGE(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				ans[st.pop()] = arr[i];

			}
			st.push(i);
		}
		while (!st.isEmpty()) {
			ans[st.pop()] = -1;

		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
}
