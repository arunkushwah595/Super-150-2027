package Lec34;

public interface StackI {

	public static final int x = 9;// Inteface ke andr agr koi variable banate ho to uska access modifier public
									// static final hoga

	public void push(int item);

	public int peek();

	// java 8
	static void fun() {

	}

	// java 9
	private static void fun1() {

	}
}
