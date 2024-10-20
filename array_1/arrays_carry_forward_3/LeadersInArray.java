package intermediate.array_1.arrays_carry_forward_3;

public class LeadersInArray {

	public static void main(String[] args) {

		// Q2 Leaders in Array

		int arr[] = { 15, -1, 7, 2, 5, 4, 2, 3 };

		// BruteForce Approach

		int countOfLeaders = 0;
		for (int i = 0; i < arr.length; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = i + 1; j < arr.length; j++) {
				if (max < arr[j]) {
					max = arr[j];
				}
			}
			if (arr[i] > max) {
				countOfLeaders++;
			}
		}
		System.out.println("(BruteForce Approach) Leaders in Array - " + countOfLeaders);

		// Time Complexity = O(n^2), Space Complexity = O(1)

		// Array Carry Forward Approach
		int countOfLeaders2 = 1; // because n-1 is always a leader.
		int max2 = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > max2) {
				countOfLeaders2++;
				max2 = arr[i];
			}
		}
		System.out.println("(Array Carry Forward Approach) Leaders in Array - " + countOfLeaders2);

		// Time Complexity = O(n), Space Complexity = O(1)

	}

}
