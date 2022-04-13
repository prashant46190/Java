package arrayPrg;

public class MaxMinWithoutBubbleSort {

	public static void main(String[] args) {
		int[] a = { 90, 20, 50, 10, 80, 30, 60, 70, 40 };
		int max = a[0];
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Max-->" + max);
		System.out.println("Min-->" + min);
	}
}
