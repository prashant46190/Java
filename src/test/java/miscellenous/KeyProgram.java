package miscellenous;

import java.util.Scanner;

public class KeyProgram {
	public static void main(String[] args) {
		int[] a = { 4, 9, 0, 1, 2 };
		             // 0 1 2 3 4
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();

		int temp;
		int k;
		for (int i = 1; i <= key; i++) {
			temp = a[0];
			for (k = 0; k < a.length-1; k++) {
				a[k] = a[k + 1];
			}
			a[a.length - 1] = temp;
			// a[k]=temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print( a[i]+" " );
		}

		// second way
		/*
		 * for(int i=key ; i<a.length ; i++) { System.out.print(a[i]+"  "); }
		 * for(int i=0 ; i<key ; i++) { System.out.print(a[i]+"  "); }
		 */
	}
}
