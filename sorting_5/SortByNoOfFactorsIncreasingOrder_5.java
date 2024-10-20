package intermediate.sorting_5; // refer 17__Jun_22_Sorting

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class sortByNoOfFactors implements Comparator<Integer> {

	public static int countOfFactors(int n) {

		int count = 0;
		for (int i = n; i >= 1; i--) {
			if (n % i == 0) {
				count++;
			}
		}

		return count;
	}

	@Override
	public int compare(Integer a, Integer b) {

		int temp = 0;
		temp = a;
		a = b;
		b = temp; // we don't know why computer is swapping the value of a & b, so here we are
					// again swapping back to their original values.

		int countofa = countOfFactors(a);
//		System.out.println(a + " " + countofa);
		int countofb = countOfFactors(b);
//		System.out.println(b + " " + countofb);
		if (countofa < countofb) {
			return 1;
		} else if (countofa == countofb) {
			if (a < b) {
				return 1;
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

}

public class SortByNoOfFactorsIncreasingOrder_5 {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(9);
		arr.add(3);
		arr.add(4);
		arr.add(8);
		arr.add(16);
		arr.add(37);
		arr.add(6);
		arr.add(13);
		arr.add(15);

		System.out.println(arr);
		Collections.sort(arr, new sortByNoOfFactors());
		System.out.println(arr);
	}

}
