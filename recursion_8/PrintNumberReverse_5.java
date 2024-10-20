package intermediate.recursion_8;

public class PrintNumberReverse_5 {

	public static void main(String[] args) {
		// (Q6) Given N, print all numbers from N to 1.
		print(5);
	}

	public static void print(int n) {
		if (n == 1) {
			System.out.println(1);
			return;
		}
		System.out.println(n);
		print(n - 1);
	}

}
