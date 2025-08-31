package Lec15;

public class Substring_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		PrintSubstring(s);
	}
	
	public static void PrintSubstring(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				System.out.println(s.substring(i, j+1));
			}
		}
	}
}
