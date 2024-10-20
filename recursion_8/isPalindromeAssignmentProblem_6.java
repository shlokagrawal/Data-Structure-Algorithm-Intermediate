package intermediate.recursion_8;

public class isPalindromeAssignmentProblem_6 {

	public static void main(String[] args) {
		// we need to make our recursion strong, that's why for first time i am writing
		// code of scaler assignment also.

		// (Q) Write a recursive function that checks whether string A is a palindrome
		// or Not. Return 1 if the string A is a palindrome, else return 0.

		// INPUT = "naman" OUTPUT = 1
		// INPUT = "shlok" OUTPUT = 0

		String s = "naman";
		String s2 = "shlok";
		System.out.println(isPalindrome(0, s.length() - 1, s));
		System.out.println(isPalindrome(0, s2.length() - 1, s2));
	}

	public static int isPalindrome(int start, int end, String A) {
		if (start >= end) {
			return 1;
		}
		if (A.charAt(start) != A.charAt(end)) {
			return 0;
		}
		return isPalindrome(start + 1, end - 1, A);
	}

}
