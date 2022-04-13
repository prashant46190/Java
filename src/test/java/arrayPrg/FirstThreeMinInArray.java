package arrayPrg;

public class FirstThreeMinInArray {
	public static void main(String[] args) {
		int[] a = new int[] { 6, 8, 1, 9, 2, 10,0 };
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		int third = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {

			if (first > a[i]) {
				third = second;
				second = first;
				first = a[i];
			} else if (second > a[i]) {
				third = second;
				second = a[i];
			} else if (third > a[i]) {
				third = a[i];
			}
		}
		System.out.println("least three elements are: " + first + " " + second + " " + third);

	}
}
