package Lec2;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=1;
		int space=n-1;
		while (row<=n) {
			int i=1;
			while (i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				if (j%2==1) {
				System.out.print("* ");}
				else {
					System.out.print("! ");
				}
				
				j++;
			}
			System.out.println();
			space--;
			star+=2;
			row++;
		}
		

	}
}
