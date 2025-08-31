package Lec18;

public class String_Builder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb= new StringBuilder("Hello");
		sb.insert(2, 'J');
		System.out.println(sb);
		System.out.println(sb.capacity());//16+5   16 phle se hi hota hai or 5 string ka size hai
		//add
		sb.append("Pookie");
		System.out.println(sb);
		sb.append(true);
		System.out.println(sb);
		sb.append('c');
		System.out.println(sb);
		sb.append(5);
		System.out.println(sb);
		
		System.out.println();
		System.out.println(sb.length());
		System.out.println(sb.charAt(10));
		System.out.println(sb.reverse());
		System.out.println(sb.delete(1, 3));
		System.out.println(sb.substring(0,6));
		
		String s=sb.toString();//StringBuilder to String
		String str="hgkshfkshf";
		sb.append(str);//String to StrinBuilder
		
//		arryalist grows 1.5*old capacity
//		stringbuilder grows 2*old +2
//		vector grows 2*old
	}

}
