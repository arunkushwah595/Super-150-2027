package Lec12;

public class Wave_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
				
		Display(arr);
		
		print_column(arr);
		
		print_row(arr);
	}
	
	public static void Display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void print_column(int[][]arr) {
		for (int col = 0; col < arr.length; col++) {
			if(col%2==1) {
				for (int row = arr.length-1; row >=0; row--) {
					System.out.print(arr[row][col]+" ");
				}
			}
			
			else {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col]+" ");
				}
			}
		}
	}
	
	
	public static void print_row(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j]+", ");
				}
			}
			else {
				for (int j = arr[i].length-1; j >=0; j--) {
					System.out.print(arr[i][j]+", ");
				}
			}
		}
	}

}