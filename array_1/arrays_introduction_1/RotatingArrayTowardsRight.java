package intermediate.array_1.arrays_introduction_1;

// refer lecture 4._Introduction_to_Arrays, Qn5 for understanding concept.
import java.util.Scanner;

public class RotatingArrayTowardsRight {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array - ");
		int size = sc.nextInt(); // for size of array
		System.out.print("Enter Array Elements - ");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter no for times of rotation - ");
		int rotation = sc.nextInt();

		rotation = rotation % size; // if rotation > array size, that's why rotation = rotation%size;

		reverseArray(arr, 0, size - 1); // for reversing whole array.

		reverseArray(arr, 0, rotation - 1);

		reverseArray(arr, rotation, size - 1);

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void reverseArray(int arr[], int startIndex, int endIndex) {
		int temp = 0;
		int i = startIndex;
		int j = endIndex;

		while (i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
