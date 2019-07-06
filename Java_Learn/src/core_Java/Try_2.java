package core_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Try_2 {
	
	public static void main(String[] args) {
		
/*		List <Integer> l=new ArrayList<>();
		for(int i=0;i<=10;i++) {
		l.add(i);}
		System.out.println(l);
ListIterator<Integer> i = l.listIterator();
while(i.hasNext())
{
	int j= i.next();
	if(j%2==0)
	{
		i.add(5);
	}	}
System.out.println(l);
*/

int count = 0;

Pattern p = Pattern.compile("\\.");

String a[] = p.split("www.google.com");
for (String s : a)
{
	System.out.println(s);
}

/*Matcher m = p.matcher("a7b@aasdaba2#9h");

while(m.find())
{
	count++;
	System.out.println(m.start() + " " + m.end() + " " + m.group());
}

System.out.println(count);*/



	}
	
	
	
	

}
