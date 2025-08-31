package Lec17;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="81615";
		PrintSubString(s);
	}
	
	public static boolean isCBnumber(long num) {
		if(num==0 || num==1) {
			return false;
		}
		int[] arr={2,3,5,7,11,13,17,19,23,29};
		for (int i = 0; i < arr.length; i++) {
			if(num==arr[i]) {
				return true;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if(num%arr[j]==0) {
				return false;
			}
		}
		return true;
	}
	
	
	
	public static void PrintSubString(String s) {
		int c=0;
		int n=10;
		boolean [] visited=new boolean [s.length()];
		for (int len = 1; len <=s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i=j-len;
				long num=Long.parseLong(s.substring(i,j));
				if(isCBnumber(num) && isVisited(visited, i, j)) {
					c++;
					for (int k = i; k < j; k++) {
						visited[k]=true;
					}
				}
			}
		}
		System.out.println(c);
	}
	
	
	
	public static boolean isVisited(boolean[] visited,int i,int j) {
		for (int k = i; k < j; k++) {
			if(visited[k]) {
				return false;
			}
		}
		return true;
	}
	
	

}
