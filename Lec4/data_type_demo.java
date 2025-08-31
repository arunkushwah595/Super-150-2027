package Lec4;
import java.util.*;


public class data_type_demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		byte b=(byte)(128);
		byte c=(byte)(300);
		short s=68;
		int i=879;
		long l=6678;
		System.out.println(b);
		System.out.println(c);
		 b = (byte) (420);
		 s = 68;
		 i = 789;
		l = 6678575548l;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		i = b;
		System.out.println(i);
		int a = 032;
		System.out.println(a);
		b = sc.nextByte();
		s = sc.nextShort();
		i = sc.nextInt();
		l = sc.nextLong();
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		

	}

}
