package core_Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Try_6 {
	
	public static void main(String[] args) {

	String s = "20/02/2018";
	
	String a[] = s.split("/");
	
	a[2] = a[2].replaceAll("20", "");
	StringBuilder sb = new StringBuilder();
	for(int i=0;i<a.length;i++)
	{
		sb.append(a[i]);
		if(i!=(a.length-1))
		sb.append("/");
	}
	
	System.out.println(sb.toString());
	System.out.println(sb.toString().contains("20/02/18"));
	System.out.println("20/02/18".contains("20/02/2018"));
	
		
	}
}

	

