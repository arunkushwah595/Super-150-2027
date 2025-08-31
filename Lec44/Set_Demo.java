package Lec44;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Complexity O(1)
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(22);
		hs.add(34);
		hs.add(14);
		hs.add(56);
		System.out.println(hs);
		
		
		// O(1)
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();// sortedge order
		lhs.add(1);
		lhs.add(22);
		lhs.add(34);
		lhs.add(14);
		lhs.add(56);
		System.out.println(lhs);
		
		
		//O(log(N))
		TreeSet<Integer> ts = new TreeSet<Integer>();// insertion order
		ts.add(1);
		ts.add(22);
		ts.add(34);
		ts.add(14);
		ts.add(56);
		System.out.println(ts);
		
	}

}
