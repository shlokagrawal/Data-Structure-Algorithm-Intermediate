package intermediate.recursion_8;

public class FibonacciSeriesRecursion_3 {

	public static void main(String[] args) {
		// (Q3) Calculate and Return the Nth Fibonacci Number.
		System.out.println(fibonacci(7));
	}

	public static int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
