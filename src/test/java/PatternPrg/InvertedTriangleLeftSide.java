package PatternPrg;

public class InvertedTriangleLeftSide {
	public static void main(String[] args) {
		int n = 5;
		for (int j = 1; j <= n; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print(" ");

			}
			for (int i = j; i <= n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
