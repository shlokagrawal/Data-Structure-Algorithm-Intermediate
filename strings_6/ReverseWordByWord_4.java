package intermediate.strings_6;

public class ReverseWordByWord_4 {

	public static void main(String[] args) {

		// (Q4) Given a char array reverse word by word.
		// no inbuilt library, no extra space.
		char S[] = { 'L', 'O', 'V', 'E', '_', 'D', 'A', 'T', 'A', '_', 'S', 'T', 'R', 'U', 'C', 'T', 'U', 'R', 'E',
				'S' };
		System.out.println(S);
		reverseString(S, 0, S.length - 1);
		reverseWord(S);
		System.out.println(S);

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

	public static void reverseWord(char S[]) {
		int n = S.length;
		int point1 = 0;
		int point2 = 0;
		while (point1 < n) {
			while (point2 < n && S[point2] != '_') {
				point2++;
			}
			reverseString(S, point1, point2 - 1);
			point1 = point2 + 1;
			point2 = point1;
		}
	}
}
