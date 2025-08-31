package Lec24;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=3;//row
		int n=3;//col
		System.out.println("\n"+Print(0, 0, m-1, n-1, ""));
	}
	
//	cr-->current row
//	cc-->current column
//	er-->end row
//	ec-->end column
	
	public static int Print(int cr, int cc, int er, int ec, String ans) {
		if(cr==er && cc==ec) {
			System.out.print(ans+" ");
			return 1;
		}
		if(cr>er || cc>ec) {
			return 0;
		}
		int a=Print(cr+1, cc, er, ec, ans+"V"); // Vertically
		int b=Print(cr, cc+1, er, ec, ans+"H"); // Horizontally
//		int c=Print(cr+1, cc+1, er, ec, ans+"D");//Diagonally
		return a+b;
	}

}
