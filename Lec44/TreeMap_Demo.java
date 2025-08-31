package Lec44;

import java.util.*;

public class TreeMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Complexity is O(log(n))
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>(); //Key wise Sorted
		//Add
		tm.put("Arun", 100);
		tm.put("P", 100);
		tm.put("Aman", 90);
//		tm.put(null, 0); // we can't put null in treemap in key 
		System.out.println(tm);
		
		//Get
		System.out.println(tm.get("Arun"));
		System.out.println(tm.get("zyx"));
		
		//ContainsKey
		System.out.println(tm.containsKey("P"));
		System.out.println(tm.containsKey("prak"));
		
		//remove
		System.out.println(tm.remove("P"));
		System.out.println(tm);

	}

}
