package arrayPrg;

public class SecondMin {
	public static void main(String[] args) {

		int[] a = { 0,1, 3, 10, 2, 9 };

		int fmin = a[0];
		int smin = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] <=fmin) 
			{
				if(a[i]!=fmin)
				{
				smin = fmin;
				}
				fmin = a[i];
			} else if (smin==fmin||a[i]<smin) {
				smin = a[i];
			}
		}
		System.out.println("fmin-->"+fmin + "smin-->" + smin);
	}
}
