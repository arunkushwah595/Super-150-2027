package Lec16;

public class Playing_with_Good_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="adccjsajfkjsflrejaeio";
		
		System.out.println(Good_String(s));
	}
	
	public static int Good_String(String s) {
		int sum=0;
		int ans=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				sum++;
				ans=Math.max(ans, sum);					
			}
			else {
				sum=0;
			}
		}
		return ans;
	}

}
