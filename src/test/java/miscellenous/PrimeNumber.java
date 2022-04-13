package miscellenous;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		 int n=5;
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		boolean flag = true;
		// if(n==0 ||n==1)
		if (n <= 1) {
			flag = false;

		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Prime");
		} else if (flag == false) {
			System.out.println("Not a Prime");
		}
	}
}
