package Lec17;

public class Static_Fun_Demo {
	
	static int val=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(val);
		System.out.println(add(2, 7));
		System.out.println(val);
	}
	
	public static int add(int a,int b) {
//		val+=5;
		int val=90;
		Static_Fun_Demo.val=Static_Fun_Demo.val + 5;
		return a+b;
	}
}
