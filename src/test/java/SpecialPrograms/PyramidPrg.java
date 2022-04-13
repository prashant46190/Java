package SpecialPrograms;

public class PyramidPrg {
public static void main(String[] args) {

	for (int i = 1; i <= 3; i++) {
		for (int j = i; j <=2 ; j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}

		if(i>1)
		{
		for (int j =i-1; j >=1; j--) {
			System.out.print(j+" ");
		}
		}
		System.out.println();
	
}
}
}
