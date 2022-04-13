package PatternPrg;

public class Diamondspattern {
	public static void main(String[] args) {
		int n = 5;
		for (int j = 1; j <= n - 1; j++) {
			for (int i = j; i <= n; i++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= j; k++) {
				System.out.print("*");
			}
			for (int i = 2; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int j = 1; j <= n; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print(" ");
			}
			for (int i = j; i <= n; i++) {
				System.out.print("*");
			}
			for (int i = j; i <= n - 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
