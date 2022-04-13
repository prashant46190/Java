package StringProgram;

public class ReverseEachWordInString {
public static void main(String[] args)
{
	String s="Test yantra";
	String[] st =s.split(" ");
	
	
	System.out.println(s);
	
	//Reverse word As in String 
		for (int i = st.length-1;i>=0; i--) 
		{
		String str=st[i];
		for(int j=str.length()-1;j>=0;j--)
		{
			System.out.print(str.charAt(j));
		}
	System.out.print(" ");
	}
		System.out.println();
		
		////Reverse word As in Reverse String 
		for (int i = 0; i < st.length; i++) 
		{
		String str=st[i];
		for(int j=str.length()-1;j>=0;j--)
		{
			System.out.print(str.charAt(j));
		}
		System.out.print(" ");
	}
}
}
