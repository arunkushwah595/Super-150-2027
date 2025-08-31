package Lec20;

public class Print_Asc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		Asc(n);
	}
	
	public static void Asc(int n) {
		if(n==0) {
			return;
		}
		Asc(n-1);
		System.out.println(n);
	}

}
