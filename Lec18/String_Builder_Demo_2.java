package Lec18;

public class String_Builder_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String_Demo();
		StringBuilder_Demo();
	}
	
	public static void String_Demo() {
		String s="";
		for(int i=0;i<100000;i++) {
			s=s+i;
		}
		System.out.println(s);
	}
	
	public static void StringBuilder_Demo() {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<100000;i++) {
			sb=sb.append(i);
		}
		System.out.println(sb);
	}

}
