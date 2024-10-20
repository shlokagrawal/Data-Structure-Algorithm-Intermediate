package intermediate.recursion_8;

public class FactorialRecursion_2 {

	public static void main(String[] args) {
		// (Q2) Calculate and Return the Nth Factorial Value.
		System.out.println(factorial(4));
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
