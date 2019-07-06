package collection_understanding.list;

import java.util.ArrayList;
import java.util.List;

public class Try_code_Geeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		System.out.println(l);
		
 
		
		  List<String> list = new ArrayList<String>(); 
		  
	        list.add("Geeks"); 
	        list.add("Practice"); 
	        list.add("Contribute"); 
	        list.add("IDE"); 
	        list.add("Courses");
	        
	        System.out.println(String.join(" , ", list));
	        
	        
		
		List<Integer> first = new ArrayList<Integer>();
		List<Integer> second = new ArrayList<Integer>();
		
		int f=l.size()/2+1;
		int s=l.size();
		second.addAll(l.subList(f,s));
		System.out.println(second);
		
		first.addAll(l.subList(0,l.size()/2+1));
		System.out.println(first);
		
	/*	for(int i = 0; i<l.size()/2; i++)
		{
			first.add(l.get(i));
		}
		
		for(int i = l.size()/2; i<l.size(); i++)
		{
			second.add(l.get(i));
		}
		System.out.println(first);
		System.out.println(second);
		
		List[] lists = split(list);
		
		 System.out.println(lists[0]); 
	        System.out.println(lists[1]); */
	}
	
	public static List[] split(List<String> list) 
    { 
        // create two empty lists 
        List<String> first = new ArrayList<String>(); 
        List<String> second = new ArrayList<String>(); 
  
        // get size of the list 
        int size = list.size(); 
  
        // First size)/2 element copy into list 
        // first and rest second list 
        for (int i = 0; i < size / 2; i++) 
            first.add(list.get(i)); 
  
        // Second size)/2 element copy into list 
        // first and rest second list 
        for (int i = size / 2; i < size; i++) 
            second.add(list.get(i)); 
  
        // return a List of array 
        return new List[] { first, second }; 
    } 

}
