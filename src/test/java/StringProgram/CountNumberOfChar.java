package StringProgram;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CountNumberOfChar 
{
public static void main(String[] args) 
{
	String s = "testyantra";
	/*Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();*/
	
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		System.out.print(s.charAt(i));
		set.add(s.charAt(i));
		//System.out.println(set);
	}
	System.out.println();
	//When we want only unique values
	for(Character ch:set)
	{
		System.out.print(ch);
	}
	
	System.out.println();
	for(Character ch:set)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				count++;
			}
		}
		System.out.println(ch+"="+count);
	
		//With duplicates
	/*if(count>=2)
	{
		System.out.print(ch+"="+count );
	}*/
	/*System.out.println();
	//without duplicates
	if(count==1)
	{
		System.out.print(ch+"="+count );
	}*/
	}
}
}

