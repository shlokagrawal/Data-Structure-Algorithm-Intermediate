package intermediate.array_1.arrays_carry_forward_3;

public class ClosestMinMax {

	public static void main(String[] args) {

		// Q3 Find Sub Array which contains Closest Minimum Maximum.

		int arr[] = { 2, 2, 6, 4, 5, 1, 5, 2, 6, 4, 1 };

		// BruteForce Approach

		// first find min and max in array.

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
		}

//		System.out.println(min);

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}

//		System.out.println(max);

		int ans = arr.length; // because in worst case whole array can be subarray. for e.g {1, 2, 3, 4, 5, 6}
								// here min and max are at the end, so whole array is smallest sub array with
								// min and max.

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == min) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] == max) {
						ans = Math.min(ans, j - i + 1); // j-i+1 is the length of sub array with min(i index) and max(j
														// index). so length j-i+1;
						break;
					}
				}
			}

			else if (arr[i] == max) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] == min) {
						ans = Math.min(ans, j - i + 1);
						break;
					}
				}
			}

		}

		System.out.println("(BruteForce Approach) Length of Smallest SubArray which contain both min & max - " + ans);

		// { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
		// { 2, 2, 6, 4, 5, 1, 5, 2, 6, 4, 1 }
		// sub arrays with min and max -
		// [2-5](length = 4)
		// [5-8](length = 4)
		// [8-10] (length = 3) so this is what our program is returning.

	}

}
