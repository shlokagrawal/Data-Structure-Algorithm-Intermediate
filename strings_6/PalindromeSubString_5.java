package intermediate.strings_6;

public class PalindromeSubString_5 {

	public static void main(String[] args) {

		// (Q5) Given a Character String, check if given substring is palindrome or not?

		char S[] = { 'a', 'n', 'a', 'm', 'a', 'd', 'a', 'm', 's', 'p', 'e' };
		System.out.println(isPalindrome(S, 3, 7));
		System.out.println(isPalindrome(S, 0, 9));
	}

	public static boolean isPalindrome(char str[], int start, int end) {
		while (start <= end) {
			if (str[start] != str[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
