package Lec25;

public class N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] board = new boolean[n][n];
		print(board, 0, n);

	}

	public static void print(boolean[][] board, int row, int tq) { // tq--------> Total Queen
		if (tq == 0) {
			Display(board);
			System.out.println();
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (isitsafe(board, row, col)) {
				board[row][col] = true;
				print(board, row + 1, tq - 1);
				board[row][col] = false;
			}
		}
	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {
		// up
		int r = row;
		while (r >= 0) {
			if (board[r][col]) {
				return false;
			}
			r--;
		}
		// diagonal--> up-right
		r = row;
		int c = col;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}

		// diagonal---> up-left
		r = row;
		c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		return true;

	}

	public static void Display(boolean[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
