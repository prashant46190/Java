package SpecialPrograms;

public class CountNumOfOccurenceOfChar {
public static void main(String[] args) {
	String s="abcddabb";
	
	for (int i = 0; i < s.length(); i++) 
	{
		int count=0;
		for (int j = i+1; j < s.length(); j++) 
		{
			if(s.charAt(i)==s.charAt(j))
			{
				count++;
			}
			else
			{
				break;
			}
		}
		i=i+count;
		count++;
		
	
	System.out.print(s.charAt(i)+"-->"+count+" ");
	}
}
}
