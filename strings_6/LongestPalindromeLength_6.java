package intermediate.strings_6;

public class LongestPalindromeLength_6 {

	public static void main(String[] args) {
		// (Q6) Given a String, calculate length of longest palindrome Substring.
		char s[] = { 'x', 'b', 'd', 'y', 'z', 'z', 'y', 'd', 'b', 'y', 'z', 'y', 'd', 'x' };
		System.out.println(palindromeLength(s));
		char a[] = { 'a', 'b', 'd', 'd', 'b', 'a' };
		System.out.println(palindromeLength(a));
	}

	public static int palindromeLength(char s[]) {
		int ans = 0;
		int n = s.length;
		for (int i = 0; i < n; i++) {
			int p1 = i;
			int p2 = i;
			int length = extend(s, p1, p2); // for odd no of elements
			ans = Math.max(ans, length);
			int length2 = extend(s, p1, p1 + 1);
			ans = Math.max(ans, length2);
		}
		return ans;
	}

	public static int extend(char s[], int p1, int p2) {
		int n = s.length;
		while (p1 >= 0 && p2 < n && (s[p1] == s[p2])) {
			p1--;
			p2++;
		}
		return p2 - p1 - 1;
	}

}
