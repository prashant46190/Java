package miscellenous;

public class PrintPrimeNumberBwOneAndHundred {
	public static void main(String[] args) {
		int n;
		
		for (int i = 0; i < 100; i++) {
			boolean flag = true;
			n = i;

			if (i <= 1) {
				flag = false;

			}
			for (int j = 2; j < n; j++) {
				if (n % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(n + " ");
			}
		}
		
		//Second logic
		/*int n;
		for (int i = 0; i <100; i++) {
			n=i;
			int j=2;
			while(j<=n)
			{
				if(n%j==0)
				{
					break;
				}
				else
				{
					j++;
				}
			}
			if(n==j)
			{
				System.out.println(n);
			}
		}*/
	}
}
