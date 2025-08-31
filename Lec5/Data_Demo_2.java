package Lec5;

import java.util.Scanner;

public class Data_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 6.8;
		float f = 67.9f;
		Scanner sc = new Scanner(System.in);
		d = sc.nextDouble();
		f = sc.nextFloat();

		boolean b = true;
		b = sc.nextBoolean();

		System.out.println(d);
		System.out.println(f);
		System.out.println(b);
		sc.close();

	}

}
