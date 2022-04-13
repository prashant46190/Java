package arrayPrg;

public class ArraySortUsingSortingAlg 
{
public static void main(String[] args) 
{
	int[] a={20,8,60,40};
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			if(a[i]<a[j])
		   {
				a[i]=a[i]+a[j];
				a[j]=a[i]-a[j];
				a[i]=a[i]-a[j];
		   }
		}
	}
	System.out.println("Using Sorting Algorithm");
	for(int k=0;k<a.length;k++)
	{
	System.out.println(a[k]);
	}
}
}
