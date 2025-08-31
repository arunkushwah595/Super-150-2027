package Lec8;


public class Trap_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(Trapping(arr));
	}
	public static int Trapping(int []arr) {
		int n=arr.length;
		int[] l=new int[n];
		int[] r=new int[n];
		l[0]=arr[0];
		for (int i = 1; i < n; i++) {
			l[i]=Math.max(l[i-1],arr[i]);
		}
		r[n-1]=arr[n-1];
		for (int i = n-2; i >=0; i--) {
			r[i]=Math.max(r[i+1],arr[i]);
		}
		int s=0;
		for (int i = 0; i < n; i++) {
			s+=(Math.min(l[i], r[i])-arr[i]);
		}
		return s;
	}

}
