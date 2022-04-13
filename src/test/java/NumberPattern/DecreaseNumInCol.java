package NumberPattern;

public class DecreaseNumInCol {
	public static void main(String[] args) {
		int count = 16;
		for (int i = 1; i < 5; i++) {
			for (int j = 4; j >= 1; j--, count--) {
				System.out.print(count + " ");
			}
			System.out.println();
		}

	}
}
