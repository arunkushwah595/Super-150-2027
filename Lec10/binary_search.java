package Lec10;

import java.util.Scanner;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		System.err.println(search(arr,target));

	}
	public static int search(int[] arr,int target) {
		int hi=arr.length-1;
		int lo=0;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return -1;
	}

}
