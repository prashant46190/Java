package StringProgram;

import java.util.LinkedHashSet;

public class ToFindWhichAreTheVowelsPresentInStringWithoutDuplicates {
public static void main(String[] args) {
	String s="testyantra";
	int count=0;
	
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
	for (Character ch:set)
	{
		System.out.print(ch);
	}
	
	System.out.println();
	for (Character ch:set)
	{
	
		if(ch=='e' ||ch=='a'||ch=='i' ||ch=='o'||ch=='u')
		{
				
			count++;
			System.out.print(ch);
		}	
	}
	
	System.out.print(" "+count);
}
}
