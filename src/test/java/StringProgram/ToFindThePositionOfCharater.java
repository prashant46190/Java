package StringProgram;

import java.util.LinkedHashSet;

public class ToFindThePositionOfCharater 
{
public static void main(String[] args) {
	
	String s="tester";
	
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	
	for (int i = 0; i < s.length(); i++) 
	{
		set.add(s.charAt(i));
		System.out.println(set);
	}
	
	for(Character ch:set)
	{
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				System.out.print(ch+ "="+(i+1) );
				break;
			}
		}
	}
		System.out.println();
		//when we from backside, that should be latest value, then rea it from backside
	//If we miss break, it will print along with duplicate	
	for(Character ch:set)
		{
		
		for(int i=s.length()-1;i>=0;i--)
		{
			if(ch==s.charAt(i))
			{
				System.out.print(ch+ "="+(i+1) );
				break;
			}
		}
		
	}
	
}
}
