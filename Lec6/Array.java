package Lec6;
import java.util.*;
public class Array {

	public static void main(String[] args) {
//		Array is in class and anything is in class it will stored in heap memory and it is non primitive.
//		Garbage value is combination of 32bits no.
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
//		OR 
//		int arr[]=new int[5];
//		int[] arr= {10,2,3,5};
//		int[] arr=new int [] {10,2,3,4,5}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		Display(arr);
		sc.close();
	}
	public static void Display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
