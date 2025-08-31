package Lec20;

public class First_Occ_of_Array {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,4,5,6,4,3,7};
		int item=4;
		System.out.println(idx(arr, item, 0));

	}
	
	
	public static int idx(int[] arr,int item,int i) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==item) {
			return i;
		}
		return idx(arr,item,i+1);
	}

}
