package intermediate.hashing_7;

import java.util.HashSet;

public class PairExists_5 { // refer 19._Jun22_Hashing_2.pdf

	public static void main(String[] args) {
//		 (Q5) check if there exits a pair(i,j) such that A[i]+A[j]=k && i!=j

		int arr[] = { 8, 9, 1, -2, 4, 5, 11, -6, 7, 5 };
		int k = 11;

		HashSet<Integer> hs = new HashSet<>();

		for (int j = 0; j < arr.length; j++) {
			int a = k - arr[j];
			if (hs.contains(a)) {
				System.out.println(true);
			}
			hs.add(a);
		}
		System.out.println(false);
	}

	// (Time Complexity - O(n) Space Complexity - O(n))

}
