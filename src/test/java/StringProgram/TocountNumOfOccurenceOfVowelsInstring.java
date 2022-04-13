package StringProgram;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class TocountNumOfOccurenceOfVowelsInstring 
{
	public static void main(String[] args)
	{
		String s = "testyantra";
		System.out.println(s);
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			//System.out.print(s.charAt(i));
			set.add(s.charAt(i));
		
		}
	 for( Character ch:set)
		{
			System.out.print(ch);
		}
		System.out.println();
		
		
		//To get know that How many(which are) vowels are repeated (how many times vowels occur)in String
		for(Character ch:set)
		{
			int count=0;
			if(ch=='e' ||ch=='a'||ch=='i' ||ch=='o'||ch=='u')
			{
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i)) 
				{
					count++;
				}
			}
		}
		if(count>0)
			System.out.println(ch+"="+count);
		}
	}
}
