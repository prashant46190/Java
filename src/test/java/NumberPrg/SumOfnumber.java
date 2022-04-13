package NumberPrg;

import java.util.Scanner;

public class SumOfnumber {
	public static void main(String[] args) {
		 int n=123;
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int sum = 0;
		while (n != 0) {
			int num = n % 10;
			sum = sum + num;
			n = n / 10;
		}
		System.out.println(sum);
	}
}
