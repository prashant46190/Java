package arrayPrg;

public class ArrayInDescending {
	public static void main(String[] args) {
		int[] a = { 90, 20, 50, 10, 80, 30, 60, 70, 40 };

		// Swap in ascending order
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		// printing In desceending
		for (int k = a.length - 1; k >= 0; k--) {
			System.out.print(a[k] + " ");
		}
		System.out.println();
		int sum1 = 0;
		for (int l = 0; l < 3; l++) {
			sum1 = sum1 + a[l];
		}
		System.out.println("sum of first 3 min numbers-->" + sum1);
	}
}