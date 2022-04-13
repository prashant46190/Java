package PatternPrg;

public class InvertedRightTriangle {

	public static void main(String[] args) {
		int n=5;
		
		for(int j=1;j<=n;j++)
		{
			for (int i = j; i<=n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
