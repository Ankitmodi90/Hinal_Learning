package core_Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Try_5 {
	
	public static void main(String[] args) {
 List<Integer> list1 = new ArrayList<>();
 list1.add(5);
 list1.add(2);
 list1.add(3);
 list1.add(4);
 System.out.println("List1"+list1);
 List<String> list2 = new ArrayList<>();
 list2.add("hinal");
 list2.add("ankit");
 list2.add("modi");
 list2.add("baby");
 list2.remove(2);
 list1.remove(new Integer(5));
 System.out.println(list1.isEmpty());
 System.out.println(list1.size());
 
 System.out.println(list2.set(2,"200"));
 System.out.println(list2);
 List<Integer> list3 = new ArrayList<>();
 list3.add(5);
 list3.add(2);
 list3.add(66);
 list3.add(45);

	System.out.println(list1.removeAll(list3));
	System.out.println(list1);
	
	}  
		
	}
	
	

