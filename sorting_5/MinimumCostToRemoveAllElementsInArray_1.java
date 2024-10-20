package intermediate.sorting_5; // refer 17__Jun_22_Sorting

import java.util.Arrays;

public class MinimumCostToRemoveAllElementsInArray_1 { // Q1

	public static void main(String[] args) {

		int arr[] = { 2, 1, 4 };
		Arrays.sort(arr);
		reverse(arr);

		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans += arr[i] * (i + 1);
		}
		System.out.println(ans);

		// (Time Complexity - O(NlogN))
	}

	public static void reverse(int[] array) // to reverse the array for descending order.
	{
		int n = array.length;
		for (int i = 0; i < n / 2; i++) {
			int temp = array[i];
			array[i] = array[n - i - 1];
			array[n - i - 1] = temp;
		}
	}
}
