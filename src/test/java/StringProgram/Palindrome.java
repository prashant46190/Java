package StringProgram;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	//String s="gadag";
	
	Scanner sc=new Scanner(System.in);
	String s = sc.next();
	String rev="";
	for (int i = s.length()-1;i>=0; i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	if(s.equals(rev))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not a Palindrome");
	}
}
}
