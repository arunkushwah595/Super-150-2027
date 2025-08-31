package Lec22;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		List<String> ll=new ArrayList<String>();
		print(n, 0, 0, "",ll);
	}

	
	public static void print(int n,int closed,int open,String ans,List<String> ll) {
		if(open==n && closed==n) {
			System.out.println(ans);
			ll.add(ans);
			return;
		}
		if(open>n || closed>open) {
			return;
		}
		
		print(n, closed+1, open, ans+")",ll);
		print(n, closed, open+1, ans+"(",ll);
	}
}
