package intermediate.bit_manipulation_2.lecture_2;

public class BitManipulation2 {

	public static void main(String[] args) {

		// (Q1) convert integer input into binary output.
		System.out.println("O/P of Q1");
		int arr[] = decimalToBinary(34);
		printBinaryNo(arr);
		System.out.println();

		// (Q2) add two binary numbers and output its binary form.
		System.out.println("O/P of Q2");
		int no1[] = decimalToBinary(3);
		int no2[] = decimalToBinary(4);
		int res[] = addTwoBinaryNos(no1, no2);
		printBinaryNo(res);
	}

	// (Q1) (Time Complexity - O(N) Space Complexity - O(1))
	public static int[] decimalToBinary(int no) {
		int binaryArr[] = new int[32];
		int digit = 0;
		int i = 31;
		while (no != 0) {
			digit = no % 2;
			binaryArr[i] = digit;
			i--;
			no = no / 2;
		}
		return binaryArr;
	}

	public static void printBinaryNo(int arr[]) {
		for (int i = 0; i < 32; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// (Q2)
	public static int[] addTwoBinaryNos(int arr[], int arr2[]) {
		int result[] = new int[32];
		int carry = 0;
		int sum = 0;
		for (int i = 31; i >= 0; i--) {
			int no1 = arr[i];
			int no2 = arr2[i];
			sum = no1 + no2 + carry;
			result[i] = sum % 2;
			carry = sum / 2;
		}
		return result;
	}

}
