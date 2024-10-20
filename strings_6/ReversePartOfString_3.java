package intermediate.strings_6;

public class ReversePartOfString_3 {

	public static void main(String[] args) {

		// (Q3) Given a String, reverse a part of a String.
		// e.g. ANACONDA reverse from starting index 2 to ending index 6
		// O/P - ANDNOCAA
		char S[] = { 'A', 'N', 'A', 'C', 'O', 'N', 'D', 'A' };
		System.out.println(S);
		char[] ans = reverseString(S, 2, 6);
		System.out.println(ans);
//		int arr[] = { 1, 2, 3, 4 };
//		System.out.println(arr);

	}

	public static char[] reverseString(char[] S, int start, int end) {
		while (start < end) {
			char temp = S[start];
			S[start] = S[end];
			S[end] = temp;
			start++;
			end--;
		}
		return S;
	}

}
