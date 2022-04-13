package arrayPrg;

public class StringValue {
	public static void main(String[] args) {

		String[] s = { "Chinnuuu", "Gaaaaaaavi", "Raaaju", "Gajii", "Babyyy", "asdfghjkll" };

		String maxName = s[0];
		int max = s[0].length();

		for (int i = 0; i <= s.length - 1; i++) {
			if (s[i].length() > max) {
				maxName = s[i];
			}
		}
		// System.out.println(maxName);
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() == maxName.length()) {
				System.out.print(" " + s[i]);
			}
		}
	}
}
