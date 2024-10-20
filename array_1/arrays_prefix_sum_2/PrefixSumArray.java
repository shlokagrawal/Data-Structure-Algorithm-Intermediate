package intermediate.array_1.arrays_prefix_sum_2;

//refer lecture from Desktop/Scaler learning/Intermediate Batch Notes/6._Arrays____Prefix_sum.pdf
public class PrefixSumArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 }; // normal array
		int prefixSumArray[] = new int[arr.length];

		// prefix sum array will look like - prefixSumArray[0] = 1, prefixSumArray[1] =
		// 1+2, prefixSumArray[2] = 1+2+3, prefixSumArray[3] = prefixSumArray[2] +
		// arr[3]
		// so prefixSumArray o/p should look like - 1,3,6,10,15

		prefixSumArray[0] = arr[0];
		for (int i = 1; i < arr.length; i++) { // it starts from 1 because if it will start from 0 prefixSumArray[i-1] =
												// -1, which is array index out of bound exception.
			prefixSumArray[i] = prefixSumArray[i - 1] + arr[i];
		}

		// printing normal array
		System.out.print("Normal Array - ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// printing prefix sum array.
		System.out.print("Prefix Sum Array - ");
		for (int i = 0; i < prefixSumArray.length; i++) {
			System.out.print(prefixSumArray[i] + " ");
		}
		System.out.println();

		// now calculating sum will take only O(1) time complexity after creation of
		// Prefix Sum Array, before that in normal array we will need to loop and then
		// calculate sum which will take O(n) time complexity.

		// SUM formula
		// SUM[L, R] - here L represent starting index and R represents Last Index,
		// means from where to where we need to calculated the sum.
		// so SUM[L, R] = prefixSumArray[R] - prefixSumArray[L-1];
		// sir has explained it in 3rd page of pdf file.
		// and if L = 0, SUM[L, R] = prefixSumArray[R];

		// for e.g. sum from array index 1 to array index 3
		// = prefixSumArray[3] - prefixSumArray[1-1];
		int sumofIndex1to3 = prefixSumArray[3] - prefixSumArray[1 - 1];
		System.out.println("Sum of index 1 to 3 = " + sumofIndex1to3);

		// for e.g. sum from array index 0 to array index 3
		// = prefixSumArray[3];
		int sumofIndex0to3 = prefixSumArray[3];
		System.out.println("Sum of index 0 to 3 = " + sumofIndex0to3);

	}

}
