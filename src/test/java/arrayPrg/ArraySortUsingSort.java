package arrayPrg;

import java.util.Arrays;

public class ArraySortUsingSort {
	public static void main(String[] args) {
		int[] a = { 90, 20, 50, 10, 60, 70, 40 };
		Arrays.sort(a);

		System.out.println("Ascending order");
		for (int i = 0; i < a.length; i++) {

			System.out.print(" " + a[i]);
		}
		System.out.println();
		System.out.println("Descending order");
		for (int i = a.length - 1; i >= 0; i--) {

			System.out.print(" " + a[i]);
		}
	}
}
