package Lec5;

import java.util.Scanner;

public class inverse_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int inum=0,place=1;
		while(num>0) {
			int rem=num%10;
			inum+=(int)(place*Math.pow(10,rem-1));
			place++;
			num/=10;
		}
		System.out.println(inum);
	}

}
