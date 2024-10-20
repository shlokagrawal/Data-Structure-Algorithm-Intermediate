package intermediate.sorting_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Desc implements Comparator<Integer> {

	@Override
	public int compare(Integer no1, Integer no2) {
		if (no1 < no2) {
			return 1;
		}

		else {
			return -1; // for java we don't return 0, we return -1;
		}
	}

}

public class DescendingOrderComparator_4 {

	public static void main(String[] args) {

		// in this program we will sort the array in descending order using comparator
//		Integer arr[] = { 10, 20, 30, 40, 50 };
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(50);
		arr.add(40);
		arr.add(30);
		System.out.println(arr);
		// Collections.sort(arr);
		// System.out.println(arr);
//		Comparator<Integer> comp = new Desc();
		Collections.sort(arr, new Desc());
		System.out.println(arr);
//		for (int i : arr) {
//			System.out.println(i);
//		}

	}

}
