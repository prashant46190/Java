package arrayPrg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortUsingCollection 
{
public static void main(String[] args) {
	int[] a={70,50,80,10};
	
ArrayList l=new ArrayList<>();

l.add(20);
l.add(320);
l.add(90);
l.add(210);
l.add(7);

Collections.sort(l);
System.out.println(l);

Collections.reverse(l);
System.out.println(l);
}
}
