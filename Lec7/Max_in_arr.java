package Lec7;

public class Max_in_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,3,4,1,7,8,9};
		System.out.println(Max1(arr));
		System.out.println(Max2(arr));
	
	}
	public static int Max1(int[] arr) {
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
		
	}
	
	public static int Max2(int[] arr) {
		int max=Integer.MIN_VALUE;  //-2^31
		for (int i = 0; i < arr.length; i++) {
			max=Math.max(max, arr[i]);
		}
		return max;
		
	}

}
