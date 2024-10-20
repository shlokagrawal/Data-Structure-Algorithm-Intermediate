package intermediate.maths_modular_arithmetic_3; //refer 15._Jun22_Maths_Modular_Arithmetic___.pdf

public class ModularArithmetic {

	public static void main(String[] args) {

		// (Q1) to find remainder of negative number.
		System.out.println("Programming Language Wise = " + (-60 % 9));
		System.out.println("Concept Wise = " + findModNegativeNumer(-60, 9));

		// (Q2) Given a,n,p calculate a^n%p
		System.out.println("(3^4)%7 = " + powerModP(3, 4, 7));
	}

	// (Q1) (Time Complexity - O(1) Space Complexity - O(1))
	public static int findModNegativeNumer(int no, int p) {
		return ((no % p) + p) % p;
	}

	// (Q2) (Time Complexity - O(N) Space Complexity - O(1))
	public static long powerModP(int a, int n, int p) {
		long ans = 1;
		for (int i = 1; i <= n; i++) {
			ans = (ans % p * a % p) % p;
		}
		return ans;
	}
}
