package intermediate.sorting_5; // refer 17__Jun_22_Sorting

import java.util.Arrays;

public class NobleIntegerElementsCanRepeat_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -10, 1, 1, 1, 4, 4, 4, 7, 10 };
		int n = arr.length;
		int ans = 0;
		int count = 0;

		Arrays.sort(arr);

		if (arr[0] == 0) {
			ans = 1;
		}
		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[i - 1]) {
				count = i;
			}
			if (arr[i] == count) {
				ans++;
			}
		}

		System.out.println(ans);
	}

}
