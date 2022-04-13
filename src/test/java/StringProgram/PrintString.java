package StringProgram;

public class PrintString {
public static void main(String[] args) 
{
	String s="Raajakumara";
	System.out.println(s.length());
	
	for (int i = 0; i < s.length(); i++) {
		System.out.print(" "+s.charAt(i));
	}

	System.out.println();
	for (int i =  s.length()-1;i>=0; i--) 
	{
		System.out.print(" "+s.charAt(i));
	}
	
}
}
