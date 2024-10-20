package intermediate.array_1.arrays_carry_forward_3; //refer 7.__Arrays___Carry_Forward

public class CountPairs {

	public static void main(String[] args) {

		// Q1 count pairs "AG"
		char[] arr = { 'B', 'A', 'A', 'G', 'D', 'C', 'A', 'G' };

		// Bruteforce Approach

		int countOfPairs = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == 'A' && arr[j] == 'G') {
					countOfPairs++;
				}
			}
		}
		System.out.println("(Bruteforce Approach) Total no of pairs of AG - " + countOfPairs);

		// Bruteforce Approach Time complexity - O(n^2), Space complexity = O(1);

		// Array Carry Forward Approach

		int countOfG = 0;
		int countOfPairs2 = 0;
		for (int i = arr.length - 1; i >= 0; i--) { // Right to Left Array Carry Forward Approach
			if (arr[i] == 'G') {
				countOfG++;
			} else if (arr[i] == 'A') {
				countOfPairs2 += countOfG;
			}
		}
		System.out.println("(R to L Array Carry Forward Approach) Total no of pairs of AG - " + countOfPairs2);

		// Array Carry Forward Approach Time complexity - O(n), Space complexity = O(1);

		// Array Carry Forward Approach Left to Right (TODO in pdf)

		int countOfA = 0;
		int countOfPairs3 = 0;
		for (int i = 0; i < arr.length; i++) { // Left to Right Array Carry Forward Approach
			if (arr[i] == 'A') {
				countOfA++;
			} else if (arr[i] == 'G') {
				countOfPairs3 += countOfA;
			}
		}
		System.out.println("(L to R Array Carry Forward Approach) Total no of pairs of AG - " + countOfPairs3);
	}

}
