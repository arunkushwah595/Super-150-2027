package Lec25;

import java.util.*;

public class Rat_Chases_its_cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			maze[i] = s.toCharArray();
		}
		int[][] ans = new int[n][m];
		print(maze, 0, 0, ans);
		if (val == false) {
			System.out.println("NO PATH FOUND");
		}

	}

	static boolean val = false;

	public static void print(char[][] maze, int cr, int cc, int[][] ans) {

		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}
		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			val = true;
			ans[cr][cc] = 1;
			display(ans);
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		int[] r = { -1, 0, 1, 0 };
		int[] c = { 0, -1, 0, 1 };
		for (int i = 0; i < c.length; i++) {
			print(maze, cr + r[i], cc + c[i], ans);
		}
//		print(maze, cr-1, cc, ans);
//		print(maze, cr, cc-1, ans);
//		print(maze, cr+1, cc, ans);
//		print(maze, cr, cc+1, ans);
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
