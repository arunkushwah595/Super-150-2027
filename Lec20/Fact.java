package Lec20;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(fact(5));
	}
	//around 10^4 call stack we can make.
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int fn=fact(n-1);
		return fn*n;
	}

}
