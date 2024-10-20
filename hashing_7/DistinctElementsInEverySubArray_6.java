package intermediate.hashing_7;

import java.util.HashMap;

public class DistinctElementsInEverySubArray_6 { // refer 19._Jun22_Hashing_2.pdf

	public static void main(String[] args) {
		// (Q6) Given N array elements, count no. of distinct elements in every subarray
		// of size k

		int arr[] = { 2, 4, 3, 8, 3, 9, 4, 9, 4, 10 };
		int n = arr.length;
		int k = 4;

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i <= k - 1; i++) {
			if (hm.containsKey(arr[i])) {
				hm.replace(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}
		System.out.println(hm.size());

		int start = 1;
		int end = k;

		while (end <= n - 1) {
			hm.replace(arr[start - 1], hm.get(arr[start - 1]) - 1);
			if (hm.get(arr[start - 1]) == 0) {
				hm.remove(arr[start - 1]);
			}
			if (hm.containsKey(arr[end])) {
				hm.replace(arr[end], hm.get(arr[end]) + 1);
			} else {
				hm.put(arr[end], 1);
			}
			System.out.println(hm.size());
			start++;
			end++;
		}

	}

}
