package arrayPrg;

public class SecondMax
{
public static void main(String[] args) {
	
	int[] a={100,20,50,10,90};
	
	int fmax=0;
	int smax=0;
	
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>fmax)
		{
			smax=fmax;
			fmax=a[i];
	    }
		else if(a[i]>smax)
		{
			smax=a[i];
		}
	}
	System.out.println(fmax+" "+smax);
}
}
