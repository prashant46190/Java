package arrayPrg;

import java.util.LinkedHashSet;

public class ToRemoveDuplicateNumInArray {
	public static void main(String[] args) {
		int[] a = { 12, 89, 12, 78, 89 };

		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i]);
			set.add(a[i]);
		}

		for (int i : set) {
			System.out.println(i);
		}
	}
}
