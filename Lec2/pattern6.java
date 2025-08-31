package Lec2;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print(" ");
				i++;
			}
			
			if (row==1 || row==n) {
				int star=n;
				int j=1;
				while(j<=star) {
					System.out.print("*");
					j++;
				}
			}
			else {
				System.out.print("*");
				int j=1;
				while(j<=n-2) {
					System.out.print(" ");
					j++;
				}
				System.out.print("*");
			}
			System.out.println();
			row++;
			space--;
		}
		
	}

}
