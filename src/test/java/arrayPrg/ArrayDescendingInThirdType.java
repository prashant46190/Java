package arrayPrg;

public class ArrayDescendingInThirdType {
	public static void main(String[] args) {
		int[] a={90,20,50,10,80,30,60,70,40};
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if (a[i]<a[j])
					{
						int temp= a[j];
						a[j]=a[i];
						a[i]=temp;
					}
				}
			}
		   
		    
			for( int k=0;k<a.length;k++)
			{
				System.out.print(a[k]+" ");
			}
		}
}
