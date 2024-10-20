package intermediate.maths_and_arrays_4;

public class MajorityElement2 {

	public static void main(String[] args) {

		int arr[] = { 4, 1, 3, 4, 4, 3, 3, 4, 3 };

		int n = arr.length;
		int me1 = 0; // me = majority element
		int count1 = 0;

		int me2 = 0;
		int count2 = 0;

		// my code
//		for (int i = 0; i < n - 1; i++) {
//			if (count1 == 0) {
//				me1 = arr[i];
//				count1 = 1;
//			}
//			if (count2 == 0) {
//				me2 = arr[i + 1];
//				count2 = 1;
//			} else if (me1 != arr[i]) {
//				count1--;
//			} else if (me2 != arr[i + 1]) {
//				count2--;
//			} else if (me1 == arr[i]) {
//				count1++;
//			} else if (me2 == arr[i + 1]) {
//				count2++;
//			}
//		}

		// sir's code
		for (int i = 0; i < n; i++) {
			if (count1 == 0) {
				me1 = arr[i];
				count1 = 1;
			} else if (count2 == 0) {
				me2 = arr[i];
				count2 = 1;
			} else if (me1 == arr[i]) {
				count1++;
			} else if (me2 == arr[i]) {
				count2++;
			} else if (me1 != arr[i] || me2 != arr[i]) {
				count1--;
				count2--;
			}
		}

		int frequency1 = 0;
		int frequency2 = 0;
		for (int i = 0; i < n; i++) {
			if (me1 == arr[i]) {
				frequency1++;
			}
			if (me2 == arr[i]) {
				frequency2++;
			}
		}

		System.out.println(me1);
		System.out.println(frequency1);
		System.out.println(me2);
		System.out.println(frequency2);

	}

}
