package Lec10;

import java.util.Scanner;

public class Max_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
	
		
		System.out.println(max_sum(arr));
		
	}
	
//	public static int max_sum(int[] arr) {
//		int max=Integer.MIN_VALUE;
//		for (int i = 0; i < arr.length; i++) {
//			int s=0;
//			for (int j = i; j < arr.length; j++) {
//				s+=arr[j];
//				max=Math.max(max, s);
//			}
//		}
//		return max;
//	}
	public static int max_sum(int[] arr) {
		int max=Integer.MIN_VALUE;
		int s=0;
		for (int i = 0; i < arr.length; i++) {
			s+=arr[i];
			max=Math.max(max, s);
			if(s<0) {
				s=0;
			}
		}
		return max;
	}

}
