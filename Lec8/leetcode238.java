package Lec8;

public class leetcode238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 0, 3, 2, 1 };
		arr = Product(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static int[] Product(int[] arr) {
		int n = arr.length;
		int[] l = new int[n];
		int[] r = new int[n];
		l[0] = 1;
		for (int i = 1; i < n; i++) {
			l[i] = l[i - 1] * arr[i - 1];
		}
		r[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			r[i] = r[i + 1] * arr[i + 1];
		}
		for (int i = 0; i < n; i++) {
			arr[i] = l[i] * r[i];
		}
		return arr;
	}

}
