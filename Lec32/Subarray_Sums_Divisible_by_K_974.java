package Lec32;

public class Subarray_Sums_Divisible_by_K_974 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 5, 0, -2, -3, 1 };
		int k = 5;
		System.out.println(count_SubArray(nums, k));
	}

	public static long count_SubArray(int[] arr, int k) {
		int n = arr.length;
		long[] freq = new long[k];
		long sum = 0;
		freq[0] = 1;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			int rem = (int) (sum % k);
			if (rem < 0) {
				rem += k;
			}
			freq[rem]++;
		}
		long ans = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] >= 2) {
				long x = freq[i];
				ans += (x * (x - 1)) / 2;
			}
		}
		return ans;
	}

}
