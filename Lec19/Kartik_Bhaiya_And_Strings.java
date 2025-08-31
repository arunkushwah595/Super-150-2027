package Lec19;

import java.util.*;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ababbabbaaaaaababab";
		int k=2;
//		Scanner sc=new Scanner(System.in);
//		int k=sc.nextInt();
//		String s=sc.next();
		int flip_a=MaxLen(s, 'a', k);
		int flip_b=MaxLen(s, 'b', k);
		System.out.println(Math.max(flip_a, flip_b));
		
	}
	
	public static int MaxLen(String s,char ch, int k) {
		int si=0,ei=0,flip=0,ans=0;
		while(ei<s.length()) {
			//grow
			if(s.charAt(ei)==ch) {
				flip++;
			}
			
			//shrink
			while(flip>k && si<=ei) {
				if(s.charAt(si)==ch) {
					flip--;
				}
				si++;
			}
			
			//ans update
			ans=Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
	}
}
