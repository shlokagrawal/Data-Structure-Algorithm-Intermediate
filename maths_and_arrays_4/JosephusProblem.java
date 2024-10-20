package intermediate.maths_and_arrays_4; // refer 16.b_Jun22_Maths_and_arrays.pdf

import java.util.Scanner;

public class JosephusProblem {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of N - ");
		int N = sc.nextInt();
		int power = (int) Math.sqrt(N);
		int y = N - (int) Math.pow(2, power);
		int ans = 2 * y + 1;
		System.out.println(ans);

		// (Time Complexity - O(1), Space Complexity - O(1))
	}

}
