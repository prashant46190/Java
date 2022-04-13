package arrayPrg;

public class Arrayprg {
	public static void main(String[] args) {
		int[] a = { 90, 20, 50, 10, 80, 30, 60, 70, 40 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int k;
		int sum1 = 0;

		System.out.println("Ascending order");

		for (k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}
		System.out.println();

		for (int l = 0; l < 3; l++) {
			sum1 = sum1 + a[l];
		}
		System.out.println("sum of first 3 max numbers-->" + sum1);

		int sum2 = 0;
		for (int l = a.length - 1; l > a.length - 4; l--) {
			sum2 = sum2 + a[l];
		}
		System.out.println("sum of first 3 min numbers-->" + sum2);
		System.out.println();

		System.out.println("Max--> " + a[0] + " Min--> " + a[a.length - 1]);
		System.out.println("Second Max--> " + a[1] + "Second Min--> " + a[a.length - 2]);

		int sum = 0;
		for (k = 0; k < a.length; k++) {
			sum = sum + a[k];
		}
		System.out.println("sum of Array-->" + sum);
	}
}
