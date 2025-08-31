package Lec6;

public class Fun{
	public static void main(String[] args) {
		
		System.out.println("hello");
		int a=8;
		int b=7;
		System.out.println(Add(a,b));
		System.out.println("Bye");
	}
	
	public static int Add(int a, int b) {
		int c=a+b;
		Sub(c,a);
		return c;
	}
	
	public static void Sub(int a, int b) {
		int c=a-b;
		System.out.println(c);
	}
	
}
