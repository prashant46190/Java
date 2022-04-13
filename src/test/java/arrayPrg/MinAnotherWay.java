package arrayPrg;

public class MinAnotherWay {

	public static void main(String[] args) {
		int[] a = {0, 90, 20, 50, 10, 80, 30, 60, 70, 40 };
		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}

		}
		System.out.println("Min-->" + min);
	}
}
