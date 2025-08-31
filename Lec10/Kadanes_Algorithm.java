package Lec10;

public class Kadanes_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,-7,5,-1,6,9};
		System.out.println(max_sum(arr));
		
	}
	
	public static int max_sum(int[] arr) {
		int max=Integer.MIN_VALUE;
		int s=0;
		for (int i = 0; i < arr.length; i++) {
			s+=arr[i];
			max=Math.max(max, s);
			if(s<0) {
				s=0;
			}
		}
		return max;
	}

}
