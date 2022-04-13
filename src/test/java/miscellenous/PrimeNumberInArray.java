package miscellenous;

public class PrimeNumberInArray {
	public static void main(String[] args) {

		int[] a = { 2, 32, 9, 23, 7, 10, 11 };

		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			prime(n);
		}

	}

	static void prime(int m) {
		boolean flag = true;
		for (int j = 2; j < m; j++) {
			if (m % j == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true)
			System.out.println(m);
	}

}
