package Lec2;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
int n=5;
int star=n;
int row=1;
while(row<=n) {
	int i=1;
	while(i<=star) {
		System.out.print("* ");
		i++;
	}
	System.out.println();
	row++;
}

	}

}
