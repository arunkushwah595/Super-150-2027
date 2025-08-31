package Lec22;

import java.util.ArrayList;
import java.util.List;

public class Lexicographical_Numbers_386 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		List<Integer> ll=new ArrayList<Integer>();
		print(n,0,ll);
	}
	
	public static void print(int n,int curr,List<Integer> ll) {
		if(curr>n) {
			return;
		}
		if(curr!=0) {
			ll.add(curr);
			System.out.println(curr);
		}
		int i=0;
		if(curr==0) {
			i=1;
		}
		for (; i < 10; i++) {
			print(n,curr*10+i,ll);
		}
	}

}
