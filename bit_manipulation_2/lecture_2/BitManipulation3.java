package intermediate.bit_manipulation_2.lecture_2; // refer 12._Jun22_Bit_Manipulation_2

public class BitManipulation3 {

	public static void main(String[] args) {

		// (Q1) Given Integer N, i check if the i'th bit position in N is set or not ?
		System.out.println("O/P of Q1");
		System.out.println(checkBitUsingRightShift(2, 1));
		System.out.println(checkBitUsingRightShift(5, 1)); // 5=0101 0th bit - true, 1st bit - false

		System.out.println(checkBitUsingLeftShift(82, 2));
		System.out.println(checkBitUsingLeftShift(82, 1));

		// (Q2) Given Integer N, Calculate how many set bits are in N ?
		// using BruteForce Solution
		System.out.println("O/P of Q2");
		System.out.println("Using BruteForce - " + countBitsBF(45)); // 45 - 101101, so 4 set bits.
		System.out.println("Using Optimized - " + countBitOptimized(45));

		// (Q3) Given x,y. Set x'th bit and y'th bit in the value 0n?
		System.out.println("O/P of Q3");
		System.out.println(setBitsApproach1(3, 1));
		System.out.println(setBitsApproach2(3, 1));
	}

	// (Q1) (Time Complexity - O(1) Space Complexity - O(1))
	public static boolean checkBitUsingRightShift(int N, int i) {
		return (((N >> i) & 1) == 1);
	}

	// (Q1) (Time Complexity - O(1) Space Complexity - O(1))
	public static boolean checkBitUsingLeftShift(int N, int i) {
		if ((N & (1 << i)) == 0) {
			return false;
		}
		return true;
	}

	// (Q2) (Time Complexity - O(1) Space Complexity - O(1))
	public static int countBitsBF(int N) {
		int count = 0;
		for (int i = 0; i < 32; i++) {
			if (checkBitUsingRightShift(N, i)) {
				count++;
			}
		}
		return count;
	}

	// (Q2) (Time Complexity - O(Logn) Space Complexity - O(1))
	public static int countBitOptimized(int N) {
		int count = 0;
		while (N > 0) {
			if ((N & 1) == 1) {
				count++;
			}
			N = N >> 1;
		}
		return count;
	} // it is exceptional case where O(Logn) is performing better then O(1), because
		// BF solution will every time will go up to 32 bits, but this optimized will
		// end
		// till it reaches 0, in rare case when 31 bit is set then this optimized one
		// will go till 31

	// (Q3) (Time Complexity - O(1) Space Complexity - O(1))
	public static int setBitsApproach1(int x, int y) {
		if (x == y) {
			return 1 << x;
		} else {
			return 1 << x + 1 << y;
		}
	}// this approach will give us wrong output

	// (Q3) (Time Complexity - O(1) Space Complexity - O(1))
	public static int setBitsApproach2(int x, int y) {
		return 1 << x | 1 << y;
	}

}
