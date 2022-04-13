package NumberPrg;

public class SumOfNumInString {
	public static void main(String[] args) {
		String s = "a11b20c35";
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				int n = s.charAt(i) - 48;
				sum = (sum * 10) + n;

			} else {
				sum1 = sum1 + sum;
				sum = 0;

			}

		}

		System.out.println(sum1+sum);
	}
}
