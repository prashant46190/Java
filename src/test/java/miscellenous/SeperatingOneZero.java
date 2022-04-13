package miscellenous;

import java.util.Arrays;

public class SeperatingOneZero 
{
public static void main(String[] args) 
{
	int [] a={1,0,1,1,0,1,0};
	int m = 0;
	int n = a.length-1;
	int[] b = new int[a.length];
 
	for (int i = 0; i < a.length; i++) 
	{
		if(a[i]!=0)
		{
			b[m]=a[i];
			m++;
		}
		else
		{
			b[n]=a[i];
			n--;
		}
	}
	for (int i = 0; i < b.length; i++) {
		System.out.print(b[i]+" ");
	}
	
	

}
}

/*//Using Sort only for 1 and 0
for(int i=0;i<=a.length-1;i++)
{
	Arrays.sort(a);
}
for(int i=a.length-1;i>=0;i--)
{
	System.out.print(" "+a[i]);
}*/