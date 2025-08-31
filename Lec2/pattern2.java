package Lec2;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=1;
		int val;
		while (row<=n) {
			
			int j=1;
			while(j<=star) {
				if(j==1 || j==row) {
					val=row;
				}
				else {
					val=0;
				}
				System.out.print(val+"\t");
				val++;
				j++;
			}
			System.out.println();
			star++;
			row++;
		}
		

	}

}
