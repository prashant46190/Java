package miscellenous;

public class PrimeInArrayWithSecondLogic {
	public static void main(String[] args) {

		int[] a = { 10, 3, 7, 9, 2 };
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			int j = 2;
			while (j <= n) {
				if (n % j == 0) {
					break;
				} else {
					j++;
				}
			}

			if (n == j) {
				System.out.println(n);
			}
		}
		
	}
}