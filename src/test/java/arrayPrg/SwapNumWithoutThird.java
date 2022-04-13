package arrayPrg;

public class SwapNumWithoutThird {
public static void main(String[] args) 
{
	swap();
	swapWithThitVar();
	swapAnother();
}	
	static void swap()
	{
	int a=90;
	int b=67;
	System.out.println("Without Third Variable");
	System.out.println("a-> "+a+" b-> "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a-> "+a+" b-> "+b);
	}

	static void swapWithThitVar()
	{
	int a=90;
	int b=67;
	System.out.println("With Third Variable");
	System.out.println("a-> "+a+" b-> "+b);
	int temp=a;
	a=b;
	b=temp;
	System.out.println("a-> "+a+" b-> "+b);
	}
	
	static void swapAnother()
	{
	int a=90;
	int b=67;
	System.out.println("Another type");
	System.out.println("a-> "+a+" b-> "+b);
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("a-> "+a+" b-> "+b);
	}
}
