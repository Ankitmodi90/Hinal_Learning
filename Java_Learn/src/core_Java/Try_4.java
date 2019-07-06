package core_Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Try_4 {
	
static int count = 0;

public static void demo(String a)
{
	 System.out.println("String - "+ a);
}

public static void demo(Object a)
{
	 System.out.println("Object - "+ a);
}


	
	public static void main(String[] args) {
		
		Set<String> list = new HashSet<String>();
		
		list.add("12345");
		
		System.out.println(list);
		
		List<String> list1 = new ArrayList();
		
		list1.add("123");
		list1.add("123");
		list1.add("123");
		list1.add("123");
		list1.add(3,"1234");
		
		list1.addAll(0,list);

		list1.retainAll(list);
		System.out.println(list1);
		
		
		
		
	}  
    public static void badMethod() 
    {
        throw new Error(); /* Line 22 */
    } 

		
	}
	
	

