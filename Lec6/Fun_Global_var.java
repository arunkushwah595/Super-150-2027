package Lec6;

public class Fun_Global_var {

	static int val=100;
	public static void main(String[] args) {
		
			
	System.out.println("hello");
	int a=8;
	int b=7;
	System.out.println(val);
	System.out.println(Add(a,b));
	System.out.println(val);
	System.out.println("Bye");
}

public static int Add(int a, int b) {
	int c=a+b;
	int val=90;
	Fun_Global_var.val=Fun_Global_var.val+10;
	return c;
}

}
