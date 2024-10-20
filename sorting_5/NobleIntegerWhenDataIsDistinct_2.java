package intermediate.sorting_5; // refer 17__Jun_22_Sorting

import java.util.Arrays;

public class NobleIntegerWhenDataIsDistinct_2 {

	public static void main(String[] args) {

		int arr[] = { -10, -5, 1, 3, 4, 5, 10 };
		int n = arr.length;
		int ans = 0;

		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			if (arr[i] == i) {
				ans++;
			}
		}

		System.out.println(ans);

		// (Time Complexity - O(NlogN))

	}

}
