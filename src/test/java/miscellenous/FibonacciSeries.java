package miscellenous;

public class FibonacciSeries {
public static void main(String[] args)
{
	int f1=0;
	int f2=1;
	int f3=0;
	
	System.out.println(f1+" "+f2);
	
	//To run for 5 times for(int i=0;i<=5;i++)
	//To get series till 5
	for(int i=1;i<25;i++)
	{
		f3=f1+f2;
		if(f3>=25)    //To avoid printing of negative numbers
		{
		    break;
		}
		else
		{
			System.out.println(f3+" ");
		}
		f1=f2;
		f2=f3;
		
		//Here we will get negative number
		/*if(f3<50)
		
	    System.out.println(f3+" ");*/
	  
		
	}
}
}
