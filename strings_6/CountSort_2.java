package intermediate.strings_6;

public class CountSort_2 {

	public static void main(String[] args) {

		// (Q2) Given a character array, which contains only lower case alphabets. sort
		// the array

		char[] arr = { 'd', 'a', 'b', 'a', 'c', 'd', 'b' };
		System.out.println(arr);
		char[] ans = sortString(arr);
		System.out.println(ans);
	}

	public static char[] sortString(char[] S) {
		int n = S.length;
		int c[] = new int[26];
		for (int i = 0; i < n; i++) {
			c[S[i] - 97]++;
		}
		int k = 0;
		for (int i = 0; i < 26; i++) {
			char ch = (char) ('a' + i);
			for (int j = 0; j < c[i]; j++) {
				S[k] = ch;
				k++;
			}
		}
		return S;
	}

}
