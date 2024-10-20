package intermediate.array_1.arrays_sliding_window_6;

public class OtherQuestions {

	public static void main(String[] args) {

		// (Q1) Max Consecutive 1's (REPLACE)
		int arr[] = { 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0 };
//		int arr[] = { 1, 1, 1, 1 };
		System.out.println(maxConsequtiveOnesReplace(arr));

		// (Q2) Max Consecutive 1's (SWAP)
		int arr2[] = { 1, 1, 0, 1, 1, 1, 0, 0 };
		System.out.println(maxConsequtiveOnesSwap(arr2));
	}

	// (Q1) (Time Complexity - O(N) Space Complexity - O(1))
	public static int maxConsequtiveOnesReplace(int arr[]) {
		int n = arr.length;
		int ans = 0;
		int len = 1; // because we can atmost replace single 0 with single 1;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				int left = 0;
				for (int l = i - 1; l >= 0; l--) {
					if (arr[l] == 1) {
						left++;
					} else {
						break;
					}
				}
				int right = 0;
				for (int r = i + 1; r < n; r++) {
					if (arr[r] == 1) {
						right++;
					} else {
						break;
					}
				}
				ans = Math.max(ans, len + left + right);
			}
		}
		if (ans == 0) {
			ans = n;
			return ans;
		} else {
			return ans;
		}

	}

	public static int maxConsequtiveOnesSwap(int arr[]) {
		int n = arr.length;
		int ans = 0;
		int totalOnes = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				totalOnes++;
			}
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				int left = 0;
				for (int l = i - 1; l >= 0; l--) {
					if (arr[l] == 1) {
						left++;
					} else {
						break;
					}
				}
				int right = 0;
				for (int r = i + 1; r < n; r++) {
					if (arr[r] == 1) {
						right++;
					} else {
						break;
					}
				}
				if (left + right == totalOnes) {
					ans = Math.max(ans, left + right);
				} else {
					ans = Math.max(ans, left + right + 1);
				}
			}
		}
		if (ans == 0) {
			ans = n;
			return ans;
		} else {
			return ans;
		}

	}

}
