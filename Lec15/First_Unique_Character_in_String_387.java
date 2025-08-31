package Lec15;

public class First_Unique_Character_in_String_387 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcode";
		System.out.println(firstUniqChar(s));
	}
	
	public static int firstUniqChar(String s){
		int[]freq=new int[26];
		for(char c:s.toCharArray()) {
			freq[c-'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			if(freq[s.charAt(i)-'a']==1) {
				return i;
			}
		}
		return -1;
	}

}
