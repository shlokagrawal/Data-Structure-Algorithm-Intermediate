package intermediate.bit_manipulation_2.introduction_1; // refer 11._Jun22_Bit_Manipulation_1

public class BitManipulation1 {

	public static void main(String[] args) {

		// (Q) Given N array elements, every element is repeating twice except 1, find
		// unique element ?

		int arr[] = { 2, 9, 7, 2, 7 };

		// BruteForce Approach
		System.out.println("Bruteforce Approach Unique Element - " + findUniqueElementBF(arr));

		// Using XOR bitwise operator
		System.out.println("Using XOR - " + findUniqueElementUsingXOR(arr));
	}

	// BruteForce Approach Algorithm (Time Complexity - O(N^2) Space Complexity -
	// O(1))
	public static int findUniqueElementBF(int arr[]) {
		int n = arr.length;
		int elem = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				elem = arr[i];
			}
		}
		return elem;
	}

	// Using XOR (Time Complexity - O(N) Space Complexity - O(1))
	public static int findUniqueElementUsingXOR(int arr[]) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		return ans;
	}

}
