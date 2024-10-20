package intermediate.hashing_7;

import java.util.HashMap;

public class FrequencyOfNumbers_1 { // refer 19._Jun22_Hashing___1.pdf

	public static void main(String[] args) {
		// (Q1) Find Frequency of Numbers.

		int arr[] = { 2, 6, 3, 8, 2, 8, 2, 3, 8, 10 };

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.replace(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}

		System.out.println(hm);

		// (Time Complexity - O(N+Q) Space Complexity - O(N))

	}

}
