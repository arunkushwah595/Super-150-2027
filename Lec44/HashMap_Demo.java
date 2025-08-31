package Lec44;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Complexity is O(1)
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		//Add
		hm.put("Arun", 100);
		hm.put("P", 100);
		hm.put("aman", 90);
		hm.put(null, 0); // we can put null in hashmap in both key as well as value
		System.out.println(hm);
		
		//Get
		System.out.println(hm.get("Arun"));
		System.out.println(hm.get("zyx"));
		
		//ContainsKey
		System.out.println(hm.containsKey("P"));
		System.out.println(hm.containsKey("prak"));
		
		//remove
		System.out.println(hm.remove("P"));
		System.out.println(hm);
		
		for(String key: hm.keySet()) {
			System.out.println(key);
		}
		
	}

}
