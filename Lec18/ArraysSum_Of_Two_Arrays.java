package Lec18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraysSum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr1= new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int []arr2= new int[m];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=sc.nextInt();
		}
		Add(arr1, arr2);
		
	}
	
	public static void Add(int[] arr1,int []arr2) {
		List<Integer> ll=new ArrayList<Integer>();
		int i=arr1.length-1, j=arr2.length-1,carry=0;
		while(i>=0 && j>=0) {
			int sum=arr1[i]+arr2[j]+carry;
			ll.add(sum%10);
			carry=sum/10;
			i--;
			j--;
		}
		while(i>=0) {
			int sum=arr1[i]+carry;
			ll.add(sum%10);
			carry=sum/10;
			i--;
		}
		while(j>=0) {
			int sum=arr2[j]+carry;
			ll.add(sum%10);
			carry=sum/10;
			j--;
		}
		if(carry>0) {
			ll.add(carry);
		}
		for(i=ll.size()-1;i>=0;i--) {
			System.out.print(ll.get(i)+", ");
		}
		System.out.println("END");
	}

}
