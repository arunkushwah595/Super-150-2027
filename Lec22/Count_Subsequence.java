package Lec22;

public class Count_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques="abc";
		System.out.println("\n"+count_subSequence(ques, ""));
//		System.out.println("\n"+count);
		
	}
	
//	static int count =0;
//	public static void print(String ques, String ans) {
//		if(ques.length()==0){
//			System.out.println(ans);
//			count++;
//			return;
//		}
//		char ch=ques.charAt(0);
//		print(ques.substring(1), ans);
//		print(ques.substring(1), ans+ch);
//	}
	
	
	public static int count_subSequence(String ques, String ans) {
		if(ques.length()==0){
			System.out.println(ans);
			return 1;
		}
		char ch=ques.charAt(0);
		int a=count_subSequence(ques.substring(1), ans);
		int b=count_subSequence(ques.substring(1), ans+ch);
		return a+b;
	}

}
