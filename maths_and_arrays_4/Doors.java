package intermediate.maths_and_arrays_4; // refer 16.b_Jun22_Maths_and_arrays.pdf

import java.util.Scanner;

public class Doors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter The Value of N - ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Number of Doors Open - " + (int) Math.sqrt(n));
		// (Time Complexity - O(sqrt(N)) Space Complexity - O(1))
	}

}
