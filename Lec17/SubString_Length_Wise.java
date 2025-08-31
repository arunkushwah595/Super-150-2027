package Lec17;

public class SubString_Length_Wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="CodingBlocks";
		PrintSubString(str);
	}
	
	public static void PrintSubString(String s) {
		for (int len = 1; len <=s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i=j-len;
				System.out.print(s.substring(i,j)+" ");
			}
			System.out.println();
		}
	}

}
