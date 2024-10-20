package intermediate.recursion_8;

public class SumRecursion_1 { // refer 20._Jun22_Recursion___1

	public static void main(String[] args) {
		// (Q1) Calculate and return the sum of [1-n] natural numbers.
		System.out.println(sum(5));
	}

	public static int sum(int n) {
		if (n == 1) {
			return 1;
		}
		return sum(n - 1) + n;
	}

}
