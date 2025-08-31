package Lec4;

import java.util.Scanner;

public class any_to_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=sc.nextInt();
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem=n%10;
			sum+=rem*mul;
			mul*=b;
			n/=10;
		}
		System.out.println(sum);

	}

}
