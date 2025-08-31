package Lec19;

public class Subarray_Product_Less_Than_K_713 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,5,2,6};
		int k=100;
		System.out.println(SubarrayProduct_Less_Than_K(arr, k));
	}
	
	public static int  SubarrayProduct_Less_Than_K	(int[] arr,int k) {
		int ans=0,si=0,ei=0,p=1;
		while(ei<arr.length) {
			//grow
			p=p*arr[ei];
			
			//shrink
			while(p>=k && si<=ei) {
				p=p/arr[si];
				si++;
			}
			
//			ans update
			ans=ans+ (ei-si+1);
			ei++;
		}
		return ans;
	}

}
