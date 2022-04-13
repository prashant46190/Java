package NumberPrg;

public class ToCountNumericValues {
public static void main(String[] args) {
	String s="abv12rv31";
	int sum=0;
for (int i = 0; i <s.length(); i++) 
	{
		if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			
			int n=s.charAt(i)-48;
	
			sum=sum+n;
		}
	}
	System.out.println(sum);
	
	
	/*String num="";
	for (int i = 0; i <s.length(); i++) 
	{
		if(Character.isDigit(s.charAt(i)))
				{
			num=num+s.charAt(i);
			}
		
				}
	System.out.println(num);
	int nm = Integer.parseInt(num);
	int sum1=0;
	while(nm!=0)
	{
		int q=nm%10;
		sum1=sum1+q;
		nm=nm/10;
	}
	System.out.println(sum1);*/
}
}
