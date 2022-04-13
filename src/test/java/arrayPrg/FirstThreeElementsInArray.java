package arrayPrg;

public class FirstThreeElementsInArray 
{
	public static void main(String[] args) 
	{
		int[] a={90,0,20,50,10};
		
		int f=0;
		int s=0;
		int t=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>f)
			{
				t=s;
				s=f;
				f=a[i];
		    }
			else if(a[i]>s)
			{
				t=s;
				s=a[i];
		    }
			else if(a[i]>t)
			{
				t=a[i];
		    }
		}
	
		System.out.print("First max-->"+f+" Second max--> "+s+" Third max--> " +t);
		System.out.println();
		System.out.println("Sum of first three-->"+(f+s+t));
	}
}
