package Lec4;

import java.util.Scanner;

public class dec_to_any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=sc.nextInt();
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem=n%b;
			sum+=rem*mul;
			mul*=10;
			n/=b;
		}
		System.out.println(sum);
				
	}

}
