package intermediate.recursion_8;

public class PrintNumber_4 {

	public static void main(String[] args) {
		// (Q4) Given N, print all numbers from 1 to N.
		print(5);
	}

	public static void print(int n) {
		if (n == 1) {
			System.out.println(1);
			return;
		}
		print(n - 1);
		System.out.println(n);
	}

}
