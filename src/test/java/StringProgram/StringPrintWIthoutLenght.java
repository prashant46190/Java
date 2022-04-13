package StringProgram;

public class StringPrintWIthoutLenght {
public static void main(String[] args) 
{
	String s="Kanyakumari";
	char[] st = s.toCharArray();
	int count = 0;
	for(char str: st){
		count++;
		System.out.print(str);
	}
	System.out.println();
	for (int i =count-1; i>=0 ; i--) 
	{
		System.out.print(s.charAt(i));
	}
	
}
}
