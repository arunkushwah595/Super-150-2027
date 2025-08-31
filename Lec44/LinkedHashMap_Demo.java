package Lec44;

import java.util.*;

public class LinkedHashMap_Demo {

	public static void main(String[] args) {

		// Complexity is O(1)
		
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>(); //insertion order
		//Add
		lhm.put("Arun", 100);
		lhm.put("P", 100);
		lhm.put("aman", 90);
		lhm.put(null, 0); // we can put null in Linkedhashmap in both key as well as value
		System.out.println(lhm);
		
		//Get
		System.out.println(lhm.get("Arun"));
		System.out.println(lhm.get("zyx"));
		
		//ContainsKey
		System.out.println(lhm.containsKey("P"));
		System.out.println(lhm.containsKey("prak"));
		
		//remove
		System.out.println(lhm.remove("P"));
		System.out.println(lhm);
	}
	
}
