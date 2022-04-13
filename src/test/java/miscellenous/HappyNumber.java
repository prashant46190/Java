package miscellenous;

public class HappyNumber {
	public static void main(String[] args) {
		int n = 35;

		int sum = summation(n);
		while (sum > 9) {
			sum = summation(sum);
		}
		System.out.println(sum);

	}

	static int summation(int n) {
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		return sum;
	}
}
