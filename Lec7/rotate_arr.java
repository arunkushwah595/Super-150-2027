package Lec7;

public class rotate_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		Rotate2(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Rotate1(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		while (k > 0) {
			int item = arr[n - 1];
			for (int i = n - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = item;
			k--;
		}
	}

	public static void Rotate2(int[] arr, int k) {
		int n = arr.length;
		k = k % n;

		// Starting n-k REverse KAro;
		Reverse(arr, 0, n - k - 1);

		// last ke k REverse Kro;
		Reverse(arr, n - k, n - 1);

		// All element reverse karo;
		Reverse(arr, 0, n - 1);
	}

	public static void Reverse(int[] arr, int i, int j) {

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;

		}
	}

}
