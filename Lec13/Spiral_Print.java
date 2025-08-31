package Lec13;

public class Spiral_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
//		int[][]arr= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		Print(arr);
	}

	public static void Print(int[][] arr) {
		// TODO Auto-generated method stub
		int minc=0, minr=0, maxc=arr[0].length-1,maxr=arr.length-1;
		int t = arr.length * arr[0].length;
		while (t > 0) {
			for (int i = minc; i <= maxc && t > 0; i++) {
				System.out.print(arr[minr][i] + " ");
				t--;

			}
			minr++;
			for (int i = minr; i <= maxr && t > 0; i++) {
				System.out.print(arr[i][maxc] + " ");
				t--;
			}
			maxc--;
			for (int i = maxc; i >= minc && t > 0; i--) {
				System.out.print(arr[maxr][i] + " ");
				t--;
			}
			maxr--;
			for (int i = maxr; i >= minr && t > 0; i--) {
				System.out.print(arr[i][minc] + " ");
				t--;
			}
			minc++;

		}
	}

}
