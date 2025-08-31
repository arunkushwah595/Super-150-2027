package Lec33;

public class AddTwoNumbers {

	public static void main(String[] args) {
		System.out.println(add(2, 7));
		System.out.println(add(2, 7, 9));
		System.out.println(add(2, 7, 9.2));

		System.out.println(add(8, 5, 5, 6, 8, 2, 7));
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int a, int b, double c) {
		return (int) (a + b + c);
	}

	public static int add(int... a) {
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		return s;
	}

}
