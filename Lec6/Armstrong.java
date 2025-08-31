package Lec6;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isArmstrong(n));
		}
	public static int countdigit(int n) {
		int c=0;
		while (n>0) {
			c++;
			n/=10;
		}
		return c;
	}
	
	public static boolean isArmstrong(int n) {
		int s=0;
		int n1=n;
		int c=countdigit(n);
		while(n1>0) {
			s+=(int)Math.pow(n1%10, c);
			n1/=10;
		}
		if (s==n) {
		return true;
		}
		else {
			return false;
		}
	}

}
