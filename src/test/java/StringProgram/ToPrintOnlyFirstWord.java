package StringProgram;

public class ToPrintOnlyFirstWord {

	public static void main(String[] args) {
		String s="Welcome to Testayntra";
		
		System.out.println(s.substring(0, 8));
		
		//Another way
		/*
		String[] st = s.split(" ");
	    for (int i = 0; i < st.length; i++) 
		{
			System.out.println(st[i]);
			break;
		}*/
	}
}
