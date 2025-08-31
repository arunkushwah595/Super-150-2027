package Lec10;

public class Kth_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		int n=145;
		System.out.println(KthRoot(k,n));

	}
	public static int KthRoot(int k,int n) {
		int ans=0;
		int lo=0;
		int hi=n;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(Math.pow(mid, k)<=n) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;//ans=5 because 5^3<=145 but 6^3!<=145
	}

}
