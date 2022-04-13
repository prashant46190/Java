package NumberPrg;

public class segrateCharacterinString {
	public static void main(String[] args) {
		String s = "ag$58jkw*7";
		String alp = "";
		String num = "";
		String spc = "";
		for (int i = 0; i < s.length(); i++) {

			// if(Character.isDigit(s.charAt(i)))
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				num = num + s.charAt(i);
			}
			// else if(Character.isAlphabetic(s.charAt(i)))
			else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				alp = alp + s.charAt(i);
			}

			else {
				spc = spc + s.charAt(i);
			}
		}
		System.out.println("Spacial Character-->" + spc);
		System.out.println("Number-->" + num);
		System.out.println("Alpahbet-->" + alp);
	}
}
