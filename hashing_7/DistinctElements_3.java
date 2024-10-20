package intermediate.hashing_7;

import java.util.HashSet;

public class DistinctElements_3 {

	public static void main(String[] args) {
		// (Q3) Given N array elements, find no of distinct elements.

		int arr[] = { 6, 3, 7, 3, 8, 6, 9 };

		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		// System.out.println(hs);
		System.out.println(hs.size());

		// (Time Complexity - O(N) Space Complexity - O(N))

	}

}
