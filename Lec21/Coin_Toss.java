package Lec21;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3; // coin is tossed three times
		cointToss(n, "");

	}
	
	public static void cointToss(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		cointToss(n-1, ans+"H");
		cointToss(n-1, ans+"T");
		
	}

}
