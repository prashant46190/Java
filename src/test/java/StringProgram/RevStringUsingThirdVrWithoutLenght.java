package StringProgram;

public class RevStringUsingThirdVrWithoutLenght 
{
public static void main(String[] args) 
{
	String s="Kanyakumari";
	String rev = "";
	char[] rev1 = s.toCharArray();
	int count = 0;
	for(char str: rev1)
	{
		count++;
		
	}

	for (int i =count-1; i>=0 ; i--) 
	{
		rev=rev+s.charAt(i);
		
	}
	System.out.print(rev);
}
}
