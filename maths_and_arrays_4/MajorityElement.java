package intermediate.maths_and_arrays_4; // refer 16.b_Jun22_Maths_and_arrays.pdf

public class MajorityElement {

	public static void main(String[] args) {

		int arr[] = { 3, 4, 3, 6, 1, 3, 2, 5, 3, 3, 3 };
//		int arr[] = { 4, 4, 4, 4, 4, 4, 5, 5, 5, 5 };
//		int arr[] = { 5, 2, 3, 5, 1, 2, 5, 5, 5, 4, 1, 1 };

		int n = arr.length;
		int me = 0; // me = majority element
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (count == 0) {
				me = arr[i];
				count = 1;
			} else if (me != arr[i]) {
				count--;
			} else {
				count++;
			}
		}

//		System.out.println("Majority Element - " + me);
//		System.out.println("Its count - " + count);

		int frequency = 0;
		for (int i = 0; i < n; i++) {
			if (me == arr[i]) {
				frequency++;
			}
		} // this loop is to iterate over the array to confirm the frequency of majority
			// element and then below is if condition.

		if (frequency > n / 2) {
			System.out.println(me + " is Majority Element");
		} else {
			System.out.println("There is no Majority Element");
		}

		// (Time Complexity - O(N), Space Complexity - O(1))

	}

}
