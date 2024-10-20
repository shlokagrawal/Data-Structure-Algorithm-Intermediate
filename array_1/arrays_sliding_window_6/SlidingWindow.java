package intermediate.array_1.arrays_sliding_window_6;

public class SlidingWindow {

	public static void main(String[] args) {

		// (Q1) Given N array elements print start and end index of all sub arrays of
		// size k
		System.out.println("O/P of Q1");
		printSubArrayStartAndEndIndex(12, 3);

		// (Q2) Given N array elements find max sum of sub array of length k
		System.out.println("O/P of Q2");
		int arr[] = { -3, 4, -2, 5, 3, -2, 8, 2, -1, 4 };
		printMaxSumOfSuArray(arr, 5);

		// Optimization 1 using prefix sum
		System.out.println("O/P of Q2 - Optimization 1(Prefix Sum)");
		printMaxSumOfSuArrayUsingPrefixSum(arr, 5);

		// Optimization 2 using SLIDING WINDOW
		System.out.println("O/P of Q2 - Optimization 2(Sliding Window)");
		printMaxSumOfSuArrayUsingSlidingWindow(arr, 5);

	}

	// (Q1) (Time Complexity - O(N) Space Complexity - O(1))
	public static void printSubArrayStartAndEndIndex(int n, int k) {
		int startIndex = 0;
		int endIndex = k - 1;
		while (startIndex <= n - k) {
			System.out.println(startIndex + " " + endIndex);
			startIndex++;
			endIndex++;
		}
	}

	// (Q2) BruteForce Approach (Time Complexity - O(N^2) Space Complexity - O(1))
	public static void printMaxSumOfSuArray(int arr[], int k) {
		int n = arr.length;
		int startIndex = 0;
		int endIndex = k - 1;
		int maxSum = Integer.MIN_VALUE;
		while (startIndex <= n - k) {
			int sum = 0;
			for (int i = startIndex; i <= endIndex; i++) {
				sum += arr[i];
			}
			maxSum = Math.max(maxSum, sum);
			startIndex++;
			endIndex++;
		}
		System.out.println(maxSum);
	}

	// (Q2) Optimization 1 (Time Complexity - O(N) Space Complexity - O(N))
	public static void printMaxSumOfSuArrayUsingPrefixSum(int arr[], int k) {
		int n = arr.length;
		int startIndex = 0;
		int endIndex = k - 1;
		int maxSum = Integer.MIN_VALUE;

		// creation of prefix array
		int pf[] = new int[n];
		pf[0] = arr[0];
		for (int i = 1; i < n; i++) {
			pf[i] = pf[i - 1] + arr[i];
		}

		while (startIndex <= n - k) {
			int sum = 0;
			if (startIndex == 0) {
				sum = pf[endIndex];
			} else {
				sum = pf[endIndex] - pf[startIndex - 1];
			}
			maxSum = Math.max(maxSum, sum);
			startIndex++;
			endIndex++;
		}
		System.out.println(maxSum);
	}

	// (Q2) Optimization 2 (Time Complexity - O(N) Space Complexity - O(1))
	public static void printMaxSumOfSuArrayUsingSlidingWindow(int arr[], int k) {
		int n = arr.length;
		int startIndex = 0;
		int endIndex = k - 1;
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;

		// calculating sum for start index to end index for first iteration
		for (int i = startIndex; i <= endIndex; i++) {
			sum += arr[i];
		}

		startIndex = 1;
		endIndex = k;

		while (startIndex <= n - k) {
			sum = sum - arr[startIndex - 1] + arr[endIndex];
			maxSum = Math.max(maxSum, sum);
			startIndex++;
			endIndex++;
		}
		System.out.println(maxSum);
	}

}
