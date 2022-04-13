package miscellenous;

public class Palindrome {
public static void main(String[] args) {
	int n=454;
	int sum=0;
	int temp=n;
	while(n!=0)
	{
	int num=n%10;
	sum=(sum*10)+num;
	n=n/10;
	}
	System.out.println(sum);
	
	if(temp==sum)
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not a Palindrome");
	}
	
	
}}

