package arrayPrg;

import java.util.LinkedHashSet;

public class ToPrintDuplicateNumInArray {
	public static void main(String[] args) {
		int[] a = { 12, 89, 10, 78, 12, 10, 78 };
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i]);
			set.add(a[i]);
		}

		/*
		 * for (int i:set) { System.out.println(i); }
		 */
		for (int i : set) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					count++;

				}
			}
			System.out.println(i + " " + count);
		}

	}
}
