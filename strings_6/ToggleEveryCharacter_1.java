package intermediate.strings_6; // refer 18._Jun22_Strings.pdf

public class ToggleEveryCharacter_1 {

	public static void main(String[] args) {
		// (Q1) Given a char array toggle every character.
		// e.g. aNAconDA o/p AnaCONda

		// Basic Approach we are doing since we started coding.
		char S[] = { 'a', 'N', 'A', 'c', 'o', 'n', 'D', 'A' };
		System.out.println(S);
		char arr[] = toggleCharacters(S);
		System.out.println(arr);

		// Approach We Learned in Intermediate Programming.
		char S2[] = { 'a', 'N', 'A', 'c', 'o', 'n', 'D', 'A' };
		System.out.println(S2);
		char arr2[] = toggleCharactersIntermediateApproach(S2);
		System.out.println(arr2);

	}

	public static char[] toggleCharacters(char[] S) {

		int n = S.length;
		for (int i = 0; i < n; i++) {
			if (S[i] >= 65 && S[i] <= 90) {
				S[i] += 32;
			} else {
				S[i] -= 32;
			}
		}

		return S;

	}

	public static char[] toggleCharactersIntermediateApproach(char[] S) {

		int n = S.length;
		for (int i = 0; i < n; i++) {
			S[i] ^= 32;
		}

		return S;

	}

}
