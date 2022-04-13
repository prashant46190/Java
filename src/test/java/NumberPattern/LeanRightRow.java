package NumberPattern;

public class LeanRightRow {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println();

		int n1 = 4;
		for (int i = n1; i >= 1; i--) {
			for (int j = 4; j >= i; j--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println();

		int n11 = 4;
		for (int i = n11; i >= 1; i--) {
			for (int j = 4; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();

		int count = 1;
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++, count++) {
				System.out.print(count + " ");
			}
			System.out.println();
		}

		int count1 = 10;
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++, count1--) {
				System.out.print(count1 + " ");
			}
			System.out.println();
		}
	}
}
