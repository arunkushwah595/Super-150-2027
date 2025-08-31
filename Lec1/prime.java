package Lec1;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12;
		int c=0;
		for (int i=2;i<n+1;i++) {
			if (n%i==0) {
				c++;
				break;
			}
		}
		if(c==1) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

}
