package Lec34;

public class Generics_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr= {10,20,30,40,50,60};
		Display(arr);
		
	}
	
	public static void Display(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
