package arrayPrg;

public class MinLengthString {
	public static void main(String[] args) {

		String[] s = { "a", "abcf", "r", "ab", "w", "abfdre", "d", "ajdkljladaml", "b", "dhaquqe", "q" };

		String minName = s[0];

		for (int i = 0; i <= s.length - 1; i++) {
			if (s[i].length() < minName.length()) {
				minName = s[i];
			}
		}
		System.out.println(minName);
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() == minName.length()) {
				System.out.print(" " + s[i]);
			}
		}
	}
}
