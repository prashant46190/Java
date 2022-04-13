package StringProgram;

import java.util.LinkedHashSet;

public class OrderOfOccurenceOfWordInString {
public static void main(String[] args) {
	String s="Welcome to Testyantra";
	String[] str = s.split(" ");
	
	LinkedHashSet<String> set=new LinkedHashSet<String>();
	
	for(String word:str)
	{
		//System.out.println(word);
		set.add(word);
	}
	/*for(String word:str)
	{
		for(int i=0;i<str.length;i++)
		{
			if(word==str[i])
			{
			System.out.println(str[i]+" "+(i+1));
			}
		}
	}*/

	for(int i=0;i<str.length;i++)
	{
		
		System.out.println(str[i]+" "+(i+1));
		}
	
}
}
