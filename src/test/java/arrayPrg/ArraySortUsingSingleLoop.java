package arrayPrg;

public class ArraySortUsingSingleLoop {
	public static void main(String[] args) {
		int[] a = { 20, 70, 16, 60, 30 };
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				a[i] = a[i] + a[i - 1];
				a[i - 1] = a[i] - a[i - 1];
				a[i] = a[i] - a[i - 1];
				i = 0;
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}
}
