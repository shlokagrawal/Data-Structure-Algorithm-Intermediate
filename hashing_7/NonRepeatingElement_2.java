package intermediate.hashing_7;

import java.util.HashMap;

public class NonRepeatingElement_2 {

	public static void main(String[] args) {
		// (Q2) Find the first Non-repeating element from the start.

		int arr[] = { 4, 3, 3, 2, 5, 6, 4, 5 };

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.replace(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			int frequency = hm.get(arr[i]);
			if (frequency == 1) {
				System.out.println(arr[i]);
				break;
			}
		}

		// (Time Complexity - O(N) Space Complexity - O(N))

	}

}
