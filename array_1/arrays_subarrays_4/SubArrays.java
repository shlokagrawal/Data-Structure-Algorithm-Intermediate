package intermediate.array_1.arrays_subarrays_4; // refer 8.Arrays___Subarrays.pdf

public class SubArrays {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		// Q1) print values of subarray.
		System.out.println("O/P of Q1");
		printSubArray(arr, 0, 0);
		System.out.println();

		// Q2) sum of all elements in given subarray.
		System.out.println("O/P of Q2");
		System.out.println(addSubArray(arr, 0, 5));

		// Q3) print all the subarrays of a given array.
		int arr2[] = { 2, 8, 9 };
		System.out.println("O/P of Q3");
		printSubArrays(arr2);

		// Q4) print sum of every single subarray.
		int arr3[] = { 3, -2, 4 };
		System.out.println("O/P of Q4");
		printSumSubArrays(arr3);

		// Q5) print sum of every single subarray using PREFIX SUM.
		System.out.println("O/P of Q5");
		printSumSubArraysPrefixSum(arr3);

		// Q6) Print sum of all subarrays starting from 2;
		int arr4[] = { 7, 3, 2, -1, 6, 8, 2, 5 };
		System.out.println("O/P of Q6");

		// using conventional method(Time Complexity = O(n^2), Space Complexity = O(1))
		sumUsingConventionalMethodFromIndex2(arr4);

		// using Carry Forward Technique
		System.out.println();
		System.out.println("O/P of Q6 using Carry Forward");
		sumUsingCarryForwardMethodFromIndex2(arr4);

		// Q7) print sum of every single subarray using CARRY FORWARD.
		System.out.println();
		System.out.println("O/P of Q7");
		printSumSubArraysCarryForward(arr3);

		// Q8) Given an Array, find sum of all subarrays sum.(Asked in Google, Facebook)
		// you have to do using CONTRIBUTION TECHNIQUE.
		int arr5[] = { 3, -1, 4 };
		System.out.println("O/P of Q8");
		System.out.println(printSumContributionTechnique(arr5));

	}

	// (Q1) method for printing subarray.
	static void printSubArray(int arr[], int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// (Q2) method for adding elements of subarray
	static int addSubArray(int arr[], int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// (Q3) method for printing all subarrays in given array.(Time Complexity =
	// O(n^3),
	// Space Complexity = O(1))
	static void printSubArrays(int arr[]) {
		for (int start = 0; start < arr.length; start++) {
			for (int end = start; end < arr.length; end++) {
				printSubArray(arr, start, end);
			}
			System.out.println();
		}
	}

	// (Q4) method for printing sum of every single subarray(Time Complexity =
	// O(n^3),
	// Space Complexity = O(1))
	static void printSumSubArrays(int arr[]) {
		int sum = 0;
		for (int start = 0; start < arr.length; start++) {
			for (int end = start; end < arr.length; end++) {
				sum = addSubArray(arr, start, end);
				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}

	// (Q5) method for printing sum of every single subarray(using PREFIX SUM)
	// (Time Complexity = O(n^2), Space Complexity = O(n))
	static void printSumSubArraysPrefixSum(int arr[]) {

		// creation of prefix sum array
		int pf[] = new int[arr.length];
		pf[0] = arr[0];
		for (int i = 1; i < pf.length; i++) {
			pf[i] = pf[i - 1] + arr[i];
		}

		int sum = 0;
		for (int start = 0; start < arr.length; start++) {
			for (int end = start; end < arr.length; end++) {
				if (start == 0) {
					sum = pf[end];
				} else {
					sum = pf[end] - pf[start - 1];
				}
				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}

	// (Q6) using conventional method to solve Q6)
	// (Time Complexity = O(n^2), Space Complexity = O(1))
	static void sumUsingConventionalMethodFromIndex2(int arr[]) {
		int sum = 0;
		for (int i = 2; i < arr.length; i++) {
			sum = addSubArray(arr, 2, i);
			System.out.print(sum + " ");
		}
	}

	// (Q6) using Carry Forward to solve Q6)
	// (Time Complexity = O(n), Space Complexity = O(1))
	static void sumUsingCarryForwardMethodFromIndex2(int arr[]) {
		int sum = 0;
		for (int i = 2; i < arr.length; i++) {
			sum += arr[i];
			System.out.print(sum + " ");
		}
	}

	// (Q7) method for printing sum of every single subarray(using CARRY FORWARD)
	// (Time Complexity = O(n^2), Space Complexity = O(1))
	static void printSumSubArraysCarryForward(int arr[]) {
		for (int start = 0; start < arr.length; start++) {
			int sum = 0;
			for (int end = start; end < arr.length; end++) {
				sum += arr[end];
				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}

	// (Q8) method for sum of all subarrays sum.(CONTRIBUTION TECHNIQUE)
	// (Time Complexity = O(n), Space Complexity = O(1))
	static int printSumContributionTechnique(int arr[]) {
		// formula of Contribution Technique = (i+1)*(n-i)
		int sum = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int count = (i + 1) * (n - i);
			sum = sum + (arr[i] * count);
		}
		return sum;
	}
}
