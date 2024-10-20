package intermediate.hashing_7;

import java.util.HashSet;

public class CheckDistinctElements_4 {

	public static void main(String[] args) {
		// (Q4) Given N array elements, check if all elements are distinct or not.

//		int arr[] = { 6, 8, 3, 2, 7 };
		int arr[] = { 3, 1, 6, 1, 4, 9, 6 };

		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}

		if (arr.length == hs.size()) {
			System.out.println("All Elements are Unique");
		} else {
			System.out.println("All Elements are Not Unique");
		}

	}

}
