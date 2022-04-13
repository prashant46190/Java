package StringProgram;

public class WithDuplicatesGetVowelCount {
public static void main(String[] args) {
	String s="testyantra";
	int count=0;
	char[] a = s.toCharArray();
	for (int i = 0; i < a.length; i++) {

		if(a[i]=='e' ||a[i]=='a'||a[i]=='i' ||a[i]=='o'||a[i]=='u')
		{
				
			count++;
			System.out.print(a[i]);
		}	
	}
	System.out.print(" "+count);
}
}
