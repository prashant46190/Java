package StringProgram;

public class PrintWordsInReverseOrder {
public static void main(String[] args) {
	String s="Welcome to Test Yantra";
	String[] st = s.split(" ");
	
	//With space
	for (int i = st.length-1;i>=0;i--) {
		System.out.print(st[i]+" ");
	}
	System.out.println();
	
	//Without space
	for (int i = st.length-1;i>=0;i--) {
		System.out.print(st[i]);
	}
}
}
