package Lec14;

import java.util.Arrays;
import java.util.Scanner;

public class Agressive_Cow_AGGCOW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n=sc.nextInt();
			int noc=sc.nextInt();
			int[] stall=new int[n];
			for (int j = 0; j < stall.length; j++) {
				stall[j]=sc.nextInt();
			}
			Arrays.sort(stall);
			System.out.println(largest_min(stall, noc));
		}
//		int [] stall= {1,2,8,4,9};
//		int noc=3;
		
		
	}
	
	public static int largest_min(int []stall,int noc) {
		int ans=0;
		int lo=0;
		int hi=stall[stall.length-1]-stall[0];
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(isitpossible(stall,noc,mid)) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
	}
	
	public static boolean isitpossible(int[] stall,int noc,int mid) {
		int pos=stall[0];
		int cows=1;
		for (int i = 1; i < stall.length; i++) {
			if(stall[i]-pos>=mid) {
				cows++;
				pos=stall[i];
			}
			if(cows>=noc) {
				return true;
			}
		}
		return false;
	}

}
